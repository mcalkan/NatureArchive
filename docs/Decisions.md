\# Architecture Decisions



This document records important architectural and product decisions made throughout the development of Nature Archive.



\---



\## ADR-001



\### Title



Offline First Architecture



\### Status



Accepted



\### Date



2026-06-23



\### Decision



Nature Archive shall be designed as an offline-first application.



All core functionality must operate without an internet connection.



Internet connectivity may enhance optional features but shall never be required for the application's primary purpose.



\### Rationale



Nature observations often occur in remote areas where network connectivity is unreliable or unavailable.



Users must be able to capture observations anywhere without worrying about internet access.



\### Consequences



\- Local database becomes the primary data source.

\- Cloud synchronization remains optional.

\- Search operates entirely offline.

\- Maps may require internet depending on provider, but GPS coordinates are always stored locally.



\## DEC-005



Title:

Compose State Before ViewModel



Status:

Accepted



Decision



Local UI state will be implemented using rememberSaveable before introducing ViewModels.



Rationale



The project follows Incremental Architecture.

State management should evolve only when shared or persistent state becomes necessary.



Applied in:

Sprint 04



\## Decision: Introduce Room for Local Persistence



\*\*Sprint:\*\* Sprint 5



\### Context



The project required a reliable offline storage mechanism while keeping the architecture simple and incremental.



\### Decision



Room was selected as the local persistence solution.



A lightweight Repository layer was introduced between the UI and Room to avoid direct DAO usage and to prepare the project for future architectural improvements.



Dependency Injection (Hilt) was intentionally postponed to keep Sprint 5 focused on persistence only.



\### Consequences



\- Offline data persistence is now available.

\- UI remains independent of Room APIs.

\- Future ViewModels can consume the Repository without major refactoring.

\- The architecture remains aligned with the project's "Offline First" and "Incremental Architecture" principles.



\### Sprint 6



Observation save currently completes silently.



User feedback (Snackbar, Toast or automatic navigation after save) was intentionally postponed to a future UX-focused sprint in order to keep Sprint 6 focused on Room read functionality.



\## Sprint 6 Decisions



\### Observation List Architecture



Observation retrieval follows the established project architecture:



UI

→ Repository

→ DAO

→ Room

→ SQLite



The UI layer continues to avoid direct DAO access.



\---



\### Temporary Repository Construction



Repository instances are currently created directly inside the UI layer.



This is considered a temporary implementation until Dependency Injection is introduced in a later sprint.



\---



\### Observation Card Scope



Observation cards intentionally remain lightweight.



Displayed information:



\- Category

\- Title

\- Notes preview

\- Created date



Features intentionally postponed:



\- Detail editing

\- Delete

\- Search

\- Sorting

\- Filtering

\- Swipe actions

\- Photos

\- Maps

\- GPS



\---



\### UX Feedback



Saving an observation currently completes silently.



Snackbar, Toast, or automatic navigation after saving have been intentionally postponed to a future UX-focused sprint in order to keep Sprint 6 focused on local data retrieval.



\## Decision 008 — Observation Detail Architecture



\*\*Sprint:\*\* Sprint 7



\*\*Decision\*\*



Observation details are loaded using only the Observation ID passed through Navigation.



The Detail screen retrieves data through the Repository, which delegates to the DAO.



\*\*Reason\*\*



Passing only lightweight identifiers keeps navigation simple, avoids transferring large objects between screens, and preserves the project's clean architecture.



\*\*Impact\*\*



\- Navigation remains lightweight.

\- UI stays independent from Room.

\- Repository remains intentionally small.

\- Architecture continues to grow only when needed.





