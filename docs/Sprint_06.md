# Sprint 06 – Observation List

**Status:** 🟡 Planned

---

# Sprint Goal

Display saved observations from the local Room database in a clean, scrollable Observation List screen.

This sprint transforms Nature Archive from a data-entry application into a usable offline archive by allowing users to view their saved observations.

---

# Objectives

- Read observations from the Room database.
- Display observations in a Material 3 list.
- Introduce the first Observation List screen.
- Handle empty and populated states gracefully.
- Preserve the existing Offline First architecture.

---

# Scope

Included:

- Read observations from Room.
- Add DAO query for retrieving observations.
- Extend the Repository with a read operation.
- Create Observation List UI.
- Display observations using LazyColumn.
- Show an Empty State when no observations exist.
- Navigate between Home and Observation List.

Excluded:

- Editing observations.
- Deleting observations.
- Observation details.
- Search and filtering.
- Sorting.
- Photos.
- GPS integration.
- Maps.
- ViewModel or Dependency Injection.

---

# Acceptance Criteria

- User can navigate to the Observation List screen.
- Saved observations are loaded from Room.
- Observations are displayed in a scrollable list.
- Empty database displays a friendly Empty State.
- Existing Observation creation flow remains functional.
- UI follows the Material 3 design system.
- Application remains fully offline.

---

# Planned Architecture

Home

↓

Observation List Screen

↓

Observation Repository

↓

Observation DAO

↓

Room Database

↓

SQLite

---

# UI Components

New screen:

- ObservationListScreen

New reusable component(s) (if needed):

- ObservationCard
- ObservationEmptyState

---

# Database

New DAO operation:

- Get all observations

Repository:

- Add read operation
- Keep repository lightweight

---

# Design Principles

Continue following:

- Offline First
- Simplicity First
- Incremental Architecture
- Documentation First
- Material 3
- Accessibility
- Reusable UI Components

---

# Out of Scope

The following features belong to future sprints:

- Observation Detail
- Edit Observation
- Delete Observation
- Search
- Filtering
- Maps
- Camera
- GPS
- Cloud Sync

---

# Risks

Potential risks:

- Breaking current save functionality.
- Loading data directly from Room without preserving architecture.
- Over-engineering the list implementation.
- Adding future sprint functionality prematurely.

Mitigation:

- Keep repository simple.
- Use LazyColumn only.
- Reuse existing Material 3 components.
- Stay within Sprint 6 boundaries.

---

# Expected Deliverables

- ObservationListScreen
- DAO read operation
- Repository read operation
- LazyColumn list
- Empty State
- Updated navigation
- Updated documentation

---

# Definition of Done

Sprint 6 is considered complete when:

- Observations saved during Sprint 5 are displayed correctly.
- Empty state works correctly.
- Navigation is functional.
- Android Studio builds successfully.
- Manual testing completed.
- Documentation updated.
- Git tag and Release created.

---

**Next Sprint Preview**

Sprint 07 will introduce the Observation Detail screen, allowing users to open and inspect individual observations.