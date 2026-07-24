\# Architecture History



This document tracks the architectural evolution of the Nature Archive project.



It records \*\*when\*\* architectural decisions were introduced, \*\*why\*\* they were needed, and \*\*how\*\* they affected the project.



The purpose of this document is to preserve architectural context throughout the project's lifetime.



\---



\# Sprint 1 — Application Foundation



\## Added



\- Jetpack Compose

\- Navigation Compose

\- Shared Scaffold

\- Material 3 Theme



\## Reason



Establish the minimum application structure required for future development.



\## Architecture



UI



\---



\# Sprint 2 — Observation Form



\## Added



\- Observation creation screen

\- Form validation

\- Reusable UI components



\## Reason



Introduce user data entry while keeping the application completely local.



\## Architecture



UI



\---



\# Sprint 3



(No architectural changes)



\---



\# Sprint 4



(No architectural changes)



\---



\# Sprint 5 — Local Persistence



\## Added



\- Room Database

\- DAO

\- Repository

\- SQLite persistence



\## Reason



Offline-first persistence became necessary once observations could be created.



\## Architecture



UI

↓

Repository

↓

DAO

↓

Room

↓

SQLite



\---



\# Sprint 6 — Observation List



\## Added



\- Observation List Screen

\- Observation Card

\- Empty State

\- Read operations from Repository



\## Reason



Users needed to view previously saved observations.



\## Architecture



UI

↓

Repository

↓

DAO

↓

Room

↓

SQLite



\---



\# Sprint 7 — Observation Detail



\## Added



\- Observation Detail Screen

\- Navigation using Observation ID

\- Repository getObservationById()

\- DAO getObservationById()



\## Reason



Users needed to inspect saved observations without introducing editing functionality.



Navigation remains lightweight by passing only Observation IDs.



\## Architecture



UI

↓

Repository

↓

DAO

↓

Room

↓

SQLite



\---



\# Architectural Principles



Throughout the project the following principles have been preserved:



\- Simplicity First

\- Offline First

\- Architecture Grows Only When Needed

\- Documentation First

\- Incremental Architecture

\- Material 3

