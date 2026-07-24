\# Nature Archive v0.6.0 – Observation List



Release Date: 24 July 2026



\## Overview



Sprint 6 introduces the first observation browsing experience.



Users can now view observations previously saved in the local Room database through a clean Material 3 interface.



\---



\## Added



\- Observation List screen

\- Observation Card component

\- Observation Empty State component

\- Room read functionality

\- Repository read operation

\- DAO query for retrieving observations

\- Home navigation to My Observations

\- LazyColumn with stable item keys



\---



\## Improved



\- Established the first complete offline read workflow.

\- Maintained the existing lightweight architecture.

\- Improved component reusability.



\---



\## Architecture



Current data flow:



UI

→ Repository

→ DAO

→ Room

→ SQLite



No ViewModel or Dependency Injection has been introduced at this stage.



\---



\## Known Limitations



The following features are intentionally postponed:



\- Observation editing

\- Observation deletion

\- Search

\- Filtering

\- Sorting

\- Photos

\- GPS

\- Maps

\- Save confirmation feedback (Snackbar/Toast)



These will be implemented in future dedicated sprints.

