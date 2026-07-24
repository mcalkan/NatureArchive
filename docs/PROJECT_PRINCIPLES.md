# Project Principles
These principles define the long-term engineering philosophy of the Nature Archive project.

Every architectural decision, sprint implementation, code review, and future feature should follow these principles.

Whenever a conflict arises between convenience and these principles, the principles take priority.

## Simplicity First

Every feature should be understandable without explanation.

---

## Offline First

The application must remain fully functional without internet access.

---

## Calm User Experience

Avoid visual noise.

Whitespace is part of the design.

---

## Incremental Architecture

Introduce architecture only when there is a clear need.

Avoid premature abstraction.

---

## Architecture Grows Only When Needed

Do not introduce architectural layers before they become necessary.

Keep the architecture lightweight and evolve it incrementally as the project grows.

For Sprint 7, keep the implementation limited to the current read-only detail flow and avoid introducing future-sprint abstractions.

---

## Sprint Boundaries

Each sprint should have a clear and limited scope.

Do not implement features that belong to future sprints.

Finish the current sprint completely before moving forward.

---

## Navigation Principles

Navigation arguments should remain minimal.

Pass identifiers instead of entire objects.

Screens are responsible for loading their own data through the Repository.

---

## Repository Principles

The Repository should remain intentionally lightweight.

Only expose operations required by the current sprint.

Avoid generic CRUD implementations before they are needed.

---

## UI Responsibilities

The UI layer should never communicate directly with Room or DAO.

All persistence operations must go through the Repository.

Reusable UI components should remain presentation-only.

---

## Material 3

Follow Material 3 guidelines while maintaining the Nature Archive identity.

---

## Documentation First

Every sprint starts with documentation.

Every sprint ends with documentation updates.

Project documentation should always reflect the current implementation.

---

## Small Commits

Each sprint should represent a clear milestone.

Create one meaningful commit and one version tag per completed sprint.

---

## User Data Safety

The user should never lose observations because of a temporary problem.

Prefer safe persistence over convenience.

---

## Performance

Prefer lightweight Compose implementations.

Avoid unnecessary recomposition.

Do not optimize prematurely.

---

## Consistency

UI, naming, spacing and architecture should remain consistent across the project.

---

## Reusability

Extract reusable UI components only when they are used in more than one place.

Avoid creating reusable abstractions too early.

---

## Testing

Every completed sprint must be manually tested before release.

Verify:

- Existing functionality still works.
- New functionality behaves as expected.
- Screen rotation.
- Offline functionality.
- Basic navigation.

---

## Continuous Improvement

Record architectural decisions.

Document important implementation choices.

Improve the project incrementally without sacrificing simplicity.