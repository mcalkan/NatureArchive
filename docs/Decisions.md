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

