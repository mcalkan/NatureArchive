# AI Guidelines — Nature Archive

This document defines how development on Nature Archive is conducted. It applies to human contributors and AI coding assistants.

---

## Development Workflow

1. **Never modify files without Product Owner approval.**
2. **Explain before coding.** At the start of every task, describe:
   - What we are building
   - Which files will change
   - Why those files need to change
3. **Wait for approval** before writing or changing code.
4. **One feature at a time.** Implement only the current sprint scope.
5. **Every sprint must produce a working app.** No broken intermediate states.
6. **Never implement future features early.** Stay within the active sprint.
7. **Explain architectural decisions** before making structural changes.
8. **Do not over-engineer.** Avoid abstractions, layers, or dependencies that are not needed yet.
9. **Do not create unnecessary files.** Every new file must serve the current sprint.

---

## Coding Standards

### Kotlin

- Write idiomatic, readable Kotlin.
- Prefer `val` over `var` unless mutation is required.
- Use expression-oriented style where it improves clarity.
- Keep functions small and focused on a single responsibility.
- Avoid magic numbers and hardcoded strings — use constants or `strings.xml`.
- Do not suppress warnings or lint issues without a documented reason.

### Compose

- Keep composables stateless where possible; hoist state to ViewModels when logic exists.
- Use `@Preview` for screens and significant UI components.
- Apply `Modifier` as the first optional parameter in composable functions.
- Read user-visible text from string resources, not hardcoded literals.

### General

- Match existing project conventions before introducing new patterns.
- Add comments only for non-obvious business logic — code should be self-explanatory.
- Do not add tests for trivial behavior unless requested or meaningful.
- Do not add dependencies beyond what the current sprint requires.

---

## UI/UX Principles

Nature Archive is a **commercial-quality, premium** application — not a demo.

- **Clarity first.** Field use means readable typography, sufficient contrast, and obvious actions.
- **Calm, nature-inspired design.** The UI should feel trustworthy and unobtrusive outdoors.
- **Offline-first mindset.** UI must remain usable without network connectivity.
- **Consistent chrome.** Shared scaffolds, app bars, and spacing across screens.
- **Progressive disclosure.** Show only what the current feature needs; avoid clutter.
- **Accessible defaults.** Respect system font scale, dark mode, and touch target sizes.
- **No placeholder screens** unless explicitly requested for the current sprint.

---

## Material 3 Guidelines

- Use **Material 3** components and theming throughout (`MaterialTheme`, `colorScheme`, `typography`).
- Apply the Nature Archive brand palette defined in `ui/theme/Color.kt`.
- **Dynamic color is disabled** for brand consistency unless the Product Owner decides otherwise.
- Support **light and dark themes** via `NatureArchiveTheme`.
- Use semantic color roles (`primary`, `secondary`, `surface`, `onSurface`, etc.) — not raw hex values in composables.
- Use defined typography styles (`headlineSmall`, `titleLarge`, `bodyLarge`, etc.) — do not invent ad-hoc text sizes.
- Prefer Material 3 components: `Scaffold`, `TopAppBar`, `Text`, `Button`, `Card`, `FloatingActionButton`, etc.
- Follow edge-to-edge guidelines with proper inset handling via scaffold padding.

---

## Architecture Principles

### Pattern: MVVM

| Layer | Responsibility |
|-------|----------------|
| **UI** | Composables, scaffolds, navigation — display state, forward user events |
| **ViewModel** | UI state, event handling, calls repositories — survives configuration changes |
| **Repository** | Single source of truth, coordinates data sources |
| **Data** | Room DAOs, entities, local storage |

### Rules

- **Single Activity.** `MainActivity` hosts the Compose navigation graph.
- **Introduce layers only when needed.** Do not create empty `data/` or `domain/` packages prematurely.
- **Hilt** is introduced together with Room and repositories — not before.
- **Offline First.** Local database is the primary data source; network is not in scope for early sprints.
- **Navigation** lives in the `navigation/` package; routes are defined in `Routes.kt`.
- **Shared UI** (scaffolds, common components) lives in `ui/components/`.
- **Feature screens** live in feature packages under `ui/` (e.g. `ui/home/`).
- **No business logic in Activities or Composables.** Move logic to ViewModels when state or behavior exists.

### Package Structure

```
com.mustafacaliskan.naturearchive/
├── MainActivity.kt
├── NatureArchiveApp.kt
├── navigation/
├── ui/
│   ├── components/
│   ├── home/
│   └── theme/
├── data/          # Sprint 6+
├── domain/        # When needed
└── di/            # With Hilt, Sprint 6+
```

---

## Sprint Rules

1. **Focus only on the current sprint.** Never jump ahead on the roadmap.
2. **Propose a file-by-file plan** before implementation.
3. **Get approval** before writing code.
4. **Deliver a runnable app** at the end of each sprint.
5. **Do not refactor unrelated code** during a feature sprint.
6. **Do not add "Coming Soon" screens** or stub routes unless the sprint explicitly requires them.
7. **Document significant decisions** in commit messages or sprint notes when relevant.

### Roadmap Reference

| Sprint | Scope |
|--------|-------|
| 0 | Development Environment |
| 1 | Application Skeleton, Navigation, Theme, Project Structure |
| 2 | Home Screen |
| 3 | Camera Module |
| 4 | Gallery Module |
| 5 | Location Module |
| 6 | Room Database + Hilt |
| 7 | Observation Module |
| 8 | Map Module |
| 9 | Search |
| 10 | Export |
| 11 | Settings |
| 12 | Google Lens Integration |

---

## Naming Conventions

### Packages

- Lowercase, feature-based: `ui.home`, `navigation`, `data.local`, `data.repository`

### Files

| Type | Convention | Example |
|------|------------|---------|
| Screen | `{Feature}Screen.kt` | `HomeScreen.kt` |
| ViewModel | `{Feature}ViewModel.kt` | `HomeViewModel.kt` |
| Repository | `{Entity}Repository.kt` | `ObservationRepository.kt` |
| DAO | `{Entity}Dao.kt` | `ObservationDao.kt` |
| Entity | `{Entity}.kt` | `ObservationEntity.kt` |
| Route | Constant in `Routes.kt` | `Routes.Home` |
| Theme | `NatureArchiveTheme`, `Color.kt`, `Type.kt` | — |
| Scaffold | `NatureArchiveScaffold.kt` | — |
| Nav graph | `NatureArchiveNavGraph.kt` | — |

### Compose

- Composable functions: PascalCase, no `Compose` suffix — `HomeScreen()`, `ObservationCard()`
- Preview functions: `{Name}Preview()` — private when possible
- Modifiers: chain in consistent order — `fillMaxSize`, `padding`, then feature-specific

### Resources

- Strings: `snake_case` with feature prefix — `home_headline`, `home_subtitle`
- Colors (XML): `snake_case` — used sparingly; prefer Compose theme colors
- Drawables: `ic_{name}`, `img_{name}`

### Routes

- Lowercase, single segment — `"home"`, `"observation_detail"`
- Defined as constants in `Routes.kt`

---

## Git Commit Conventions

Use clear, concise commit messages in the imperative mood.

### Format

```
<type>: <short summary>

[optional body — explain why, not just what]
```

### Types

| Type | Use |
|------|-----|
| `feat` | New feature or sprint deliverable |
| `fix` | Bug fix |
| `refactor` | Code change that neither fixes a bug nor adds a feature |
| `style` | UI/theme changes with no logic change |
| `docs` | Documentation only |
| `test` | Adding or updating tests |
| `chore` | Build, Gradle, tooling, config |

### Examples

```
feat: add home screen with observation list placeholder

docs: add README and AI development guidelines

style: apply Nature Archive Material 3 color palette

feat: introduce Room database and observation entity
```

### Rules

- One logical change per commit when possible.
- Do not commit secrets (API keys, `local.properties`, credentials).
- Do not commit build artifacts (`.gradle/`, `build/`, `.idea/` — already in `.gitignore`).
- Do not force-push to `main`.
- Do not commit unless explicitly requested by the Product Owner.

---

## AI Assistant Role

When working on this project, the AI acts as **Senior Android Engineer**. The Product Owner approves all plans and code changes.

Before every task:

1. State what will be built.
2. List files to create or modify.
3. Explain why.
4. Wait for approval.
5. Implement only the approved scope.

After every task:

- Summarize what changed.
- Note anything the Product Owner should verify (build, run, UI check).
- Do not suggest or start the next sprint unless asked.

Never assume requirements.

If something is unclear, ask before implementing.

Prefer small, maintainable files.

Avoid files exceeding 300-400 lines unless absolutely necessary.


Every screen should feel like a production application.

Avoid placeholder-looking layouts.

Prioritize usability.

Prioritize spacing.

Follow Material 3.


Write code as if another senior Android developer will maintain it.

## Design Language

Nature Archive should evoke the feeling of being outdoors.

The interface should feel calm, clean, natural and relaxing.

Avoid aggressive colors.

Avoid technical-looking interfaces.

Favor generous spacing, rounded corners and subtle elevation.

The application should feel like a premium field journal rather than a data management tool.

### UI State Rule

State should remain local to the screen until there is a clear requirement for sharing or persistence.

Prefer:

- remember
- rememberSaveable
- derivedStateOf

Avoid introducing ViewModels prematurely.

### Room Persistence

- Use Room as the primary local persistence solution.
- Access Room only through the Repository layer.
- Keep repositories lightweight and focused on the current sprint scope.
- Avoid direct database access from UI components unless explicitly documented during early project stages.

## Sprint 6 Notes

### Observation List

Sprint 6 introduces the first read workflow of the application.

Guidelines:

- Read observations only through the Repository.
- The UI must never access Room or DAO directly.
- Keep the Observation List lightweight and focused.
- Reusable UI components (ObservationCard and ObservationEmptyState) should remain presentation-only.
- Do not introduce ViewModel, Hilt, Flow, or StateFlow before they are actually needed.

The current Repository creation inside the UI layer is an intentional temporary solution.
It will be replaced by Dependency Injection in a future sprint.

Observation cards should display only:

- Category
- Title
- Notes preview
- Created date

No edit, delete, detail editing, search, filtering, or sorting functionality should be introduced before their dedicated sprint.

