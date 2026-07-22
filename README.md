# Nature Archive

Explore Today. Remember Forever.

A premium Android application for hikers, mushroom hunters, botanists, bird watchers, and nature enthusiasts.

## Project Overview

Nature Archive is a personal nature journal where users can permanently store their own field observations. The app is designed for offline-first use in the field, with a polished, commercial-quality experience.

Users will be able to:

- Take photos directly from the camera
- Select photos from the gallery
- Save GPS coordinates
- Save observation date and time
- Save notes
- Save species information
- Save tags and categories
- Open observation locations on Google Maps
- Search and filter observations
- Export observations

AI features such as Google Lens integration and automatic species identification are planned for later versions.

## Mission

Create a reliable, beautiful, and durable personal archive of nature observations — built incrementally, sprint by sprint, with every release remaining a working application.

## Technology Stack

| Layer | Technology |
|-------|------------|
| Language | Kotlin |
| UI | Jetpack Compose |
| Architecture | MVVM |
| Database | Room |
| Dependency Injection | Hilt *(introduced with the database layer)* |
| Navigation | Navigation Compose |
| Async | Coroutines + Flow |
| Maps | Google Maps SDK |
| Camera | CameraX |
| Storage | Offline First |

## Roadmap Summary

| Sprint | Focus |
|--------|-------|
| 0 | Development Environment ✅ |
| 1 | Application Skeleton, Navigation, Material Theme, Project Structure ✅ |
| 2 | Home Screen |
| 3 | Camera Module |
| 4 | Gallery Module |
| 5 | Location Module |
| 6 | Room Database |
| 7 | Observation Module |
| 8 | Map Module |
| 9 | Search |
| 10 | Export |
| 11 | Settings |
| 12 | Google Lens Integration |
| — | Beta |
| — | v1.0 |

## Current Sprint

**Sprint 1 — Completed**

Delivered the application shell:

- Project structure (`navigation/`, `ui/components/`, `ui/home/`, `ui/theme/`)
- Nature Archive Material 3 theme (light/dark, brand palette)
- Navigation Compose with a single Home route
- Shared app scaffold with top app bar
- Minimal branded Home screen

**Next: Sprint 2 — Home Screen**

## Project Structure

```
NatureArchive/
└── android-app/          # Android Gradle project
    ├── app/              # Application module
    ├── gradle/           # Version catalog & wrapper
    ├── build.gradle.kts
    └── settings.gradle.kts
```

Android source lives under:

```
android-app/app/src/main/java/com/mustafacaliskan/naturearchive/
```

## Build Instructions

### Prerequisites

- Android Studio (latest stable recommended)
- JDK 11 or higher
- Android SDK with API 36

### Build from Android Studio

1. Open the `android-app` folder in Android Studio.
2. Wait for Gradle sync to complete.
3. Select a device or emulator.
4. Run the app (▶) or use **Build → Make Project**.

### Build from Command Line

```bash
cd android-app
./gradlew assembleDebug
```

On Windows:

```bat
cd android-app
gradlew.bat assembleDebug
```

The debug APK is generated at:

```
android-app/app/build/outputs/apk/debug/app-debug.apk
```

### Run Tests

```bash
cd android-app
./gradlew test
./gradlew connectedAndroidTest
```

## Documentation

- [AI Guidelines](AI_GUIDELINES.md) — development workflow, coding standards, and sprint rules for contributors and AI assistants.

## License

TBD

## Design Philosophy

Nature Archive is designed as a premium personal field journal.

The application follows these principles:

- Offline First
- Material 3
- Simple before complex
- Clean architecture
- Incremental development
- Every sprint delivers a working application
- User experience comes before feature quantity

The goal is to build a production-quality application rather than a demonstration project.

## Changelog

### Sprint 0
- Development environment
- Android Studio
- Cursor
- GitHub repository

### Sprint 1
- Navigation
- Material Theme
- App Skeleton

---

# 6. Iconography

Icons help users quickly recognize actions, categories, and navigation.

Nature Archive uses icons to support the interface—not to replace text.

Icons should always improve clarity and never introduce ambiguity.

---

## Icon Library

The application adopts **Material Symbols Rounded** as the primary icon set.

Reasons:

- Modern appearance
- Excellent Material 3 integration
- Consistent visual language
- High readability across different screen sizes
- Optimized for Android

Custom icons may be introduced in future versions only when a suitable Material icon does not exist.

---

## Icon Usage

Icons should accompany actions, navigation, and metadata where they improve recognition.

Typical examples include:

- Add Observation
- Camera
- Gallery
- Location
- Map
- Search
- Filter
- Favorite
- Settings
- Export

Icons should not replace clear text labels for important actions.

---

## Icon Size

Recommended icon sizes:

| Size | Usage |
|------|-------|
| 20dp | Inline metadata |
| 24dp | Standard actions |
| 32dp | Empty states |
| 48dp | Feature illustrations |

Avoid using oversized icons unless they serve as the primary visual element of a screen.

---

## Icon Style

Use outlined or rounded icons consistently throughout the application.

Avoid mixing icon families within the same screen.

Consistency is more important than variety.

---

## Category Icons

Observation categories should have consistent icons.

Examples:

| Category | Suggested Icon |
|----------|----------------|
| Mushroom | Forest |
| Plant | Eco |
| Tree | Park |
| Flower | Local Florist |
| Bird | Pets |
| Insect | Pest Control |
| Rock | Terrain |
| Water | Water |

These mappings may evolve as the application grows but should remain consistent once established.

---

## Accessibility

Icons that trigger actions should always include accessible labels.

Icons alone should not communicate critical information.

Where necessary, combine icons with descriptive text.

---

# 7. Layout Rules

Nature Archive follows a clean, structured layout that emphasizes content over interface elements.

Layouts should guide the user's attention naturally while maintaining consistency across all screens.

---

## Screen Structure

Most screens should follow this structure:

1. Top App Bar
2. Primary Content
3. Optional Floating Action Button
4. Snackbar (when required)

Navigation elements should remain predictable throughout the application.

---

## Content Width

Content should use the available screen width while respecting the standard horizontal padding.

Avoid edge-to-edge content unless displaying photographs or maps.

---

## Content Hierarchy

Each screen should communicate information in a clear order:

1. Primary action
2. Main content
3. Supporting information
4. Metadata

Users should immediately understand where to focus.

---

## Section Organization

Long screens should be divided into logical sections.

Each section should have:

- Clear spacing
- Optional section title
- Consistent grouping of related information

Avoid mixing unrelated content.

---

## Scroll Behavior

Vertical scrolling is preferred.

Nested scrolling should be avoided whenever possible.

Important actions should remain easily accessible.

---

## Cards and Lists

Cards should align consistently within lists.

Do not mix different card styles on the same screen.

Lists should maintain equal spacing between items.

---

## Forms

Forms should present fields in a logical order.

Related fields should remain visually grouped.

Avoid presenting too many input fields on a single screen.

---

## Images

Observation photographs are the primary visual element of the application.

Images should receive sufficient space and should never feel compressed by surrounding interface elements.

When possible:

- Display large image previews.
- Preserve the original aspect ratio.
- Avoid unnecessary cropping.

---

## Maps

Maps should appear only when they provide meaningful context.

They should complement observation data rather than dominate the screen.

---

## Responsive Design

The application should adapt gracefully to different device sizes.

Layouts should remain usable on:

- Small phones
- Large phones
- Foldable devices (future)
- Tablets (future)

Responsive behavior should rely on adaptive layouts rather than fixed dimensions.

---

# 8. Empty States & Tone of Voice

Every empty state should encourage the user rather than simply report the absence of data.

Nature Archive should feel welcoming, calm, and supportive.

The application should never sound cold, robotic, or overly technical.

---

## Communication Style

The application's tone of voice should be:

- Friendly
- Calm
- Professional
- Encouraging
- Respectful

Avoid dramatic or playful language.

The application is a trusted field journal—not a social media platform.

---

## Writing Principles

Messages should be:

- Short
- Positive
- Easy to understand
- Human
- Helpful

Avoid unnecessary technical terminology whenever possible.

---

## First Launch

Example:

**Headline**

Your journal is waiting.

**Message**

Start recording the beauty of nature, one observation at a time.

---

## No Observations

Headline

No observations yet.

Message

Every adventure begins with a single discovery.

---

## No Search Results

Headline

Nothing matched your search.

Message

Try another keyword or browse your observations instead.

---

## Offline Mode

Headline

You're offline.

Message

Everything you've already saved is still available.

New observations will continue to be stored on your device.

---

## Empty Favorites

Headline

No favorites yet.

Message

Mark your most memorable discoveries to find them quickly later.

---

## Empty Category

Headline

Nothing here yet.

Message

Your future discoveries will appear here.

---

## Success Messages

Success messages should confirm actions without interrupting the user.

Examples:

- Observation saved.
- Photo updated.
- Export completed.
- Backup created.

Messages should remain brief and reassuring.

---

## Error Messages

Errors should explain:

- What happened
- What the user can do next

Avoid blaming the user.

Good example:

"We couldn't access your location.
You can still save your observation."

Poor example:

"GPS Error (Code 201)."

---

## Confirmation Messages

Confirmation dialogs should clearly describe the action.

Example:

Delete Observation

This action cannot be undone.

[Cancel]     [Delete]

Avoid vague confirmations.

---

## Tone Summary

Nature Archive speaks like an experienced hiking companion.

It is calm, knowledgeable, and respectful of the user's time.

The application should inspire users to continue exploring nature rather than distract them from it.



