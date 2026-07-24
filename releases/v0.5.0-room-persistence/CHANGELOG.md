\# v0.5.0 – Local Persistence with Room



\*\*Release Date:\*\* 2026-07-24



\## Overview



Sprint 5 introduces the first local persistence layer for Nature Archive.



The application can now save observations into a local SQLite database using Room, marking the transition from a UI prototype to a functional offline-first application.



\## Added



\- Added Room persistence library.

\- Created `ObservationEntity` for local data storage.

\- Implemented `ObservationDao` for database operations.

\- Added `NatureArchiveDatabase` singleton.

\- Introduced `ObservationRepository` as a lightweight data access layer.

\- Connected the \*\*Save\*\* action to Room persistence.

\- Observations are now stored locally on the device.



\## Changed



\- Updated Gradle configuration to include Room and KSP.

\- Integrated persistence into the existing Observation screen.

\- Preserved the existing Material 3 UI without visual changes.



\## Technical Notes



\- The project continues to follow the \*\*Offline First\*\* architecture.

\- Repository remains intentionally lightweight to avoid premature abstraction.

\- A temporary Gradle compatibility workaround was applied for the current Android Studio / AGP / KSP toolchain:

&#x20; - `android.disallowKotlinSourceSets=false`

\- This workaround will be reviewed and removed when the toolchain compatibility issue is resolved.



\## Known Limitations



\- Saved observations are persisted locally but are not yet displayed in the UI.

\- Observation listing will be implemented in \*\*Sprint 6\*\*.



\## Status



✅ Sprint 5 completed successfully.

