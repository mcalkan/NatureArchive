\# Nature Archive

🌿



Nature Archive



> Software Design Document (SDD)



\---



\## Document Information



| Item | Value |

|------|-------|

| Project | Nature Archive |

| Document | Software Design Document |

| Version | 1.0 |

| Status | Draft |

| Author | Mustafa Çalışkan |

| Platform | Android |

| Future Platform | iOS |

| Language | Kotlin |

| UI Toolkit | Jetpack Compose |

| Architecture | MVVM (Offline First) |

| Last Updated | 2026-06-23 |



\---



\## Table of Contents



1\. Introduction

2\. Product Overview

3\. Functional Requirements

4\. Non-Functional Requirements

5\. High-Level Architecture

6\. Data Model

7\. Navigation Architecture

8\. UI Design Principles

9\. Project Structure

10\. Coding Standards

11\. Testing Strategy

12\. Security

13\. Privacy

14\. Release Strategy

15\. Future Vision

16\. Appendix



\# 1. Introduction



\## 1.1 Purpose



This document describes the overall software architecture, technical decisions, design principles, and long-term vision of the Nature Archive application.



It serves as the primary technical reference for future development and ensures consistency across all implementation phases.



\---



\## 1.2 Product Vision



Nature Archive is a premium offline-first mobile application that enables nature enthusiasts to build a permanent digital archive of their discoveries.



Rather than acting as a social platform, Nature Archive focuses on preserving personal observations including photographs, GPS locations, notes, species information and metadata.



Every observation represents a personal memory that can be searched, revisited and expanded over time.



\---



\## 1.3 Design Philosophy



The application should feel:



\- Calm

\- Elegant

\- Premium

\- Minimal

\- Natural



The interface should never distract from the user's observations.



Technology should remain invisible.



Nature remains the focus.



\---



\## 1.4 Core Principles



\### Offline First



All primary features must work without internet connectivity.



Internet should enhance the application—not be required.



\---



\### Privacy First



Users own their data.



No unnecessary tracking.



No advertisements.



No hidden analytics.



\---



\### Simplicity



Every screen should have one clear purpose.



Avoid unnecessary complexity.



\---



\### Performance



Large archives containing thousands of observations should remain responsive.



\---



\### Scalability



The architecture must support future features without major refactoring.



Examples include:



\- AI Species Identification

\- Cloud Backup

\- iOS Application

\- Web Companion



\---



\# 2. Product Overview



\## 2.1 Product Purpose



Nature Archive is designed to help users permanently document and organize their personal discoveries in nature.



Each observation combines photographs, geographic location, date, time, notes, categories, tags, and optional species information into a single searchable record.



The application is intended to become a long-term personal archive rather than a temporary collection of photos.



\---



\## 2.2 Target Audience



Primary users include:



\- Hikers

\- Mushroom hunters

\- Botanists

\- Bird watchers

\- Nature photographers

\- Campers

\- Outdoor enthusiasts



Secondary users include:



\- Biology students

\- Researchers

\- Travelers

\- Families exploring nature



\---



\## 2.3 Primary User Goals



Users should be able to:



\- Quickly record new observations.

\- Attach one or more photographs.

\- Automatically store GPS coordinates.

\- Add notes and personal comments.

\- Organize observations using categories and tags.

\- Search previous observations instantly.

\- Revisit locations using map integration.

\- Build a personal nature archive over many years.



\---



\## 2.4 Product Scope



Version 1 focuses on building a reliable offline-first archive.



Core capabilities include:



\- Observation management

\- Local photo storage

\- GPS location recording

\- Offline search

\- Local database

\- Map integration

\- Export functionality



Cloud synchronization and AI-assisted features are intentionally excluded from the first public release.



\---



\## 2.5 Out of Scope



The application is not intended to become:



\- A social network

\- A hiking navigation application

\- A public biodiversity database

\- A photo editing application

\- A marketplace

\- A live messaging platform



Maintaining a focused scope helps preserve simplicity and long-term maintainability.



\---



\## 2.6 Success Criteria



The first production release will be considered successful if users can:



\- Capture observations in less than one minute.

\- Access their archive completely offline.

\- Find any previous observation within seconds.

\- Return to the recorded location using integrated maps.

\- Trust the application as their long-term personal nature journal.



\---



\# 3. Functional Requirements



This section defines the functional capabilities of Nature Archive.



Each requirement represents a feature that provides direct value to the end user.



\---



\## FR-001 Observation Management



The application shall allow users to create, edit, view and delete observations.



Each observation represents a single discovery made in nature.



\---



\## FR-002 Photo Capture



The application shall allow users to capture one or more photographs using the device camera.



Captured photos shall be associated with a single observation.



\---



\## FR-003 Photo Selection



The application shall allow users to import one or more photographs from the device gallery.



Imported photos shall be attached to an observation.



\---



\## FR-004 GPS Recording



The application shall automatically record the GPS coordinates of an observation whenever location permission is granted.



If location is unavailable, the user may save the observation without GPS data.



\---



\## FR-005 Observation Notes



The application shall allow users to write personal notes for each observation.



Notes may contain free text without character restrictions.



\---



\## FR-006 Categories



Each observation shall belong to one category.



Example categories include:



\- Mushroom

\- Plant

\- Tree

\- Bird

\- Animal

\- Insect

\- Landscape

\- Other



Categories shall remain fully customizable in future versions.



\---



\## FR-007 Tags



Users may assign multiple tags to each observation.



Tags improve search and organization.



\---



\## FR-008 Favorites



Users shall be able to mark observations as favorites.



Favorite observations shall be accessible through dedicated filters.



\---



\## FR-009 Search



Users shall be able to search observations using:



\- Notes

\- Species name

\- Category

\- Tags

\- Date



Search shall operate completely offline.



\---



\## FR-010 Archive



The application shall display all observations in a searchable archive.



The archive shall support sorting and filtering.



\---



\## FR-011 Map Integration



Users shall be able to open the recorded observation location in Google Maps.



Future versions may include an integrated map view.



\---



\## FR-012 Export



Users shall be able to export selected observations for backup or sharing.



\---



\## FR-013 Offline Operation



All core functionality shall operate without internet connectivity.



Internet access shall only enhance optional features.



\---



\## FR-014 AI Assistance (Future)



Future versions may support:



\- Google Lens integration

\- Species identification

\- AI-generated summaries

\- AI-assisted tagging



These features are intentionally excluded from Version 1.0.



\---



\# 4. Non-Functional Requirements



This section defines the quality attributes of Nature Archive.



Unlike functional requirements, these requirements describe how the system should behave rather than what it should do.



\---



\## NFR-001 Performance



The application shall launch in less than 2 seconds on a typical mid-range Android device.



Navigation between screens shall feel immediate.



Scrolling large archives shall remain smooth.



\---



\## NFR-002 Offline Availability



All primary functionality shall remain available without internet connectivity.



No observation shall depend on an active network connection.



\---



\## NFR-003 Reliability



Observation data shall never be lost due to temporary application failures.



Saving observations must be transactional and robust.



\---



\## NFR-004 Usability



The application shall require minimal learning.



Users should be able to create a new observation intuitively.



The interface shall prioritize clarity over feature density.



\---



\## NFR-005 Accessibility



The application shall follow Material Design accessibility recommendations.



Support shall include:



\- scalable text

\- sufficient color contrast

\- accessible touch targets



\---



\## NFR-006 Maintainability



The codebase shall remain modular and easy to extend.



Future features should require minimal changes to existing modules.



\---



\## NFR-007 Scalability



The application shall support thousands of observations without significant performance degradation.



\---



\## NFR-008 Security



User data shall remain stored locally unless explicit export or synchronization is requested.



No hidden background uploads shall occur.



\---



\## NFR-009 Privacy



Nature Archive shall not collect unnecessary personal information.



Location data belongs exclusively to the user.



\---



\## NFR-010 Battery Efficiency



Background processing shall be minimized.



Location services shall only be used when necessary.



\---



\## NFR-011 Storage Efficiency



Images shall be stored efficiently.



The application shall avoid unnecessary duplication of media files.



\---



\## NFR-012 Consistency



The user interface shall follow a single design language across all screens.



Spacing, typography, colors and interactions shall remain consistent throughout the application.



\---



\# 5. System Overview



Nature Archive is a single-activity Android application built using a modern, offline-first architecture.



The application is organized into independent layers, each with a clearly defined responsibility.



At a high level, the system consists of:



\- Presentation Layer

\- Domain Layer

\- Data Layer

\- Local Storage

\- Device Services



The application interacts primarily with the Android operating system and stores all user-generated content locally.



External services such as Google Maps or Google Lens enhance the user experience but are not required for core functionality.



\---



\## System Context



Nature Archive communicates with:



\- Android Camera

\- Android Location Services

\- Local Storage

\- Room Database

\- Google Maps (optional)

\- Google Lens (future)

\- Cloud Services (future)



The application remains fully functional even when all optional services are unavailable.



\---



\## Application Characteristics



Nature Archive is designed to be:



\- Offline-first

\- Privacy-focused

\- Modular

\- Maintainable

\- Scalable

\- Responsive



The architecture favors simplicity and long-term maintainability over unnecessary complexity.



\---



\## Layer Responsibilities



\### Presentation



Responsible for user interaction and rendering the interface.



\### Domain



Contains business rules and application logic.



\### Data



Coordinates local storage and future remote data sources.



\### Device Services



Provides access to platform capabilities such as:



\- Camera

\- GPS

\- File System

\- Permissions



\---



\# 6. Architectural Principles



The architecture of Nature Archive is guided by a small set of principles that influence every technical decision throughout the project.



These principles help maintain consistency, improve maintainability, and support future growth.



\---



\## AP-001 Separation of Concerns



Each layer of the application shall have a single, well-defined responsibility.



\- UI renders data.

\- ViewModels manage UI state.

\- Use Cases contain business rules.

\- Repositories coordinate data.

\- Data Sources provide access to storage or external services.



No layer should take responsibility for another.



\---



\## AP-002 Single Source of Truth



Every piece of data shall have one authoritative source.



For Version 1, the Room database is the single source of truth for observation data.



The user interface must never become the owner of application data.



\---



\## AP-003 Offline First



The application shall always prioritize locally available data.



Network connectivity is considered optional and must never block core functionality.



Future cloud synchronization shall complement—not replace—the local database.



\---



\## AP-004 Modularity



Features should be developed as independent modules whenever practical.



New functionality should be added with minimal impact on existing code.



The architecture should encourage extension rather than modification.



\---



\## AP-005 Simplicity



The simplest solution that satisfies current requirements should be preferred.



The project shall avoid unnecessary abstraction and premature optimization.



Complexity should only be introduced when justified by real requirements.



\---



\## AP-006 Testability



Business logic should remain independent of Android framework classes whenever possible.



Core logic should be designed so that it can be tested in isolation.



\---



\## AP-007 Readability



Code is read more often than it is written.



The project shall prioritize:



\- meaningful names

\- small functions

\- small composables

\- consistent formatting

\- self-documenting code



\---



\## AP-008 Consistency



Every feature should follow the same architectural patterns.



Consistency is preferred over cleverness.



A predictable codebase is easier to maintain than a highly optimized but inconsistent one.



\---



\# 7. High-Level Architecture



Nature Archive follows a layered MVVM architecture designed to separate user interface, business logic, and data management.



Each layer has a clearly defined responsibility and communicates only with adjacent layers.



This approach improves maintainability, testability, and scalability while keeping the codebase simple enough for a single developer to manage over the long term.



\---



\## Architecture Overview



```text

+------------------------------------------------------+

|                  Presentation Layer                  |

|------------------------------------------------------|

| Compose UI                                           |

| Navigation                                           |

| ViewModels                                           |

+---------------------------+--------------------------+

&#x20;                           |

&#x20;                           ▼

+------------------------------------------------------+

|                    Domain Layer                      |

|------------------------------------------------------|

| Use Cases                                            |

| Business Rules                                       |

| Repository Interfaces                                |

+---------------------------+--------------------------+

&#x20;                           |

&#x20;                           ▼

+------------------------------------------------------+

|                     Data Layer                       |

|------------------------------------------------------|

| Repository Implementations                           |

| Local Data Sources                                   |

| Future Remote Data Sources                           |

+---------------------------+--------------------------+

&#x20;                           |

&#x20;                           ▼

+------------------------------------------------------+

|                  Persistence Layer                   |

|------------------------------------------------------|

| Room Database                                        |

| Local File Storage                                   |

+---------------------------+--------------------------+

&#x20;                           |

&#x20;                           ▼

+------------------------------------------------------+

|                  Android Platform                    |

|------------------------------------------------------|

| CameraX                                              |

| Location Services                                    |

| Storage Access Framework                             |

| Google Maps (Optional)                               |

+------------------------------------------------------+

```



\---



\## Layer Responsibilities



\### Presentation Layer



Responsible for rendering the user interface and handling user interactions.



The Presentation Layer should never directly access the database or Android platform services.



\---



\### Domain Layer



Contains the application's business rules.



This layer is independent from Android framework classes whenever possible.



Business logic should remain reusable and easy to test.



\---



\### Data Layer



Responsible for coordinating access to local storage and future external services.



Repositories hide implementation details from the rest of the application.



\---



\### Persistence Layer



Responsible for storing observations, metadata, and image references.



Room serves as the primary source of structured data.



Image files are stored separately within the application's private storage.



\---



\### Platform Layer



Provides access to Android-specific capabilities such as:



\- Camera

\- GPS

\- File Storage

\- Runtime Permissions



Platform services should always be accessed through dedicated abstractions rather than directly from the user interface.



\---



\## Dependency Flow



Dependencies shall always point downward.



Presentation



↓



Domain



↓



Data



↓



Persistence / Platform



No lower layer shall depend on a higher layer.



This dependency direction helps keep the architecture modular and maintainable.



\---



\# 8. Data Model



Nature Archive is centered around a single primary entity: \*\*Observation\*\*.



An Observation represents one unique discovery made by the user in nature.



All future features—including search, maps, export, AI assistance, and statistics—are built upon this entity.



\---



\## Observation Entity



Each observation contains the following information.



| Field | Type | Required | Description |

|--------|------|----------|-------------|

| id | UUID | Yes | Unique identifier |

| title | String | No | Optional custom title |

| notes | String | No | User notes |

| category | Enum | Yes | Observation category |

| speciesName | String | No | Identified species |

| latitude | Double | No | GPS latitude |

| longitude | Double | No | GPS longitude |

| locationName | String | No | Human-readable location (future enhancement) |

| observationDate | Instant | Yes | Date and time of the observation |

| favorite | Boolean | Yes | Favorite flag |

| createdAt | Instant | Yes | Record creation timestamp |

| updatedAt | Instant | Yes | Last modification timestamp |



\---



\## Image Information



Observation images are stored separately from the database.



The database stores references to image files rather than the image content itself.



Each observation may contain one or more images.



Image metadata includes:



\- File path

\- Thumbnail path (future)

\- Capture timestamp

\- Image order



\---



\## Categories



Version 1 includes the following default categories:



\- Mushroom

\- Plant

\- Tree

\- Flower

\- Bird

\- Animal

\- Insect

\- Fungus

\- Landscape

\- Rock

\- Water

\- Other



Future versions may allow custom categories.



\---



\## Tags



Observations may contain zero or more user-defined tags.



Examples:



\- edible

\- poisonous

\- spring

\- autumn

\- forest

\- lake

\- rare



Tags improve organization and search capabilities.



\---



\## Relationships



Observation



↓



One Observation



↓



One or More Images



↓



Zero or More Tags



\---



\## Future Extensions



The data model is intentionally designed to support future additions without breaking existing observations.



Potential future fields include:



\- Weather

\- Elevation

\- AI Summary

\- Google Lens Result

\- Species Confidence

\- Weather Conditions

\- Personal Rating



\---



\# 9. Navigation Architecture



Nature Archive follows a \*\*single-activity architecture\*\* using Navigation Compose.



Each screen is implemented as an independent composable destination.



Navigation should remain simple, predictable, and easy to extend.



\---



\## Navigation Principles



\- Single Activity architecture

\- Navigation Compose

\- One responsibility per screen

\- Type-safe routes where practical

\- Navigation state owned by the Navigation Component



\---



\## Planned Navigation Flow



Home



↓



New Observation



↓



Observation Details



↓



Edit Observation



↓



Archive



↓



Search



↓



Map



↓



Settings



\---



\## Navigation Rules



The following rules apply throughout the application:



\- Every screen should have a single clear purpose.

\- Avoid deep navigation hierarchies.

\- Frequently used actions should be reachable within three user interactions whenever practical.

\- Back navigation should always behave according to Android platform conventions.

\- Navigation logic must remain separate from UI components.



\---



\## Future Navigation



Future versions may introduce additional destinations such as:



\- Statistics

\- AI Identification

\- Cloud Backup

\- Import / Export Wizard



These features shall integrate into the existing navigation graph without requiring architectural changes.



\---



\# 10. UI Design Principles



Nature Archive follows a clean, modern Material 3 design language with a strong emphasis on simplicity, readability, and usability.



The user interface should support the user's activities without becoming the center of attention.



Nature remains the primary focus.



\---



\## Design Goals



The interface should feel:



\- Calm

\- Elegant

\- Natural

\- Premium

\- Consistent



Visual noise should be minimized.



\---



\## Design Principles



The application shall follow these principles:



\- Consistent spacing

\- Clear typography hierarchy

\- Predictable navigation

\- Minimal visual clutter

\- Accessible color contrast

\- Comfortable touch targets

\- Responsive layouts



\---



\## Material Design



Nature Archive adopts Material Design 3 as its design foundation.



Material components may be customized to match the application's visual identity while preserving usability and accessibility.



\---



\## Consistency



Every screen shall follow the same design language.



Common UI elements—including cards, buttons, app bars, dialogs, lists, and empty states—should maintain consistent behavior and appearance throughout the application.



\---



\## Design System



Detailed specifications for colors, typography, spacing, components, icons, and interaction patterns are maintained separately in the \*\*UI\_Design\_System.md\*\* document.



This document should be considered the single source of truth for all visual design decisions.



\---



\# 11. Project Structure



The project is organized to clearly separate application source code, documentation, assets, release artifacts, and testing resources.



This structure aims to keep the repository clean, scalable, and easy to navigate for long-term development.



\---



\## Repository Structure



```text

NatureArchive/

│

├── android-app/

├── assets/

├── docs/

├── release/

├── test-data/

│

├── README.md

└── .gitignore

```



\---



\## android-app/



Contains the complete Android application source code.



This includes:



\- Kotlin source files

\- Jetpack Compose UI

\- Resources

\- Gradle configuration

\- Unit and instrumentation tests



\---



\## assets/



Contains project assets that are not bundled into the Android application.



Examples include:



\- Design references

\- Icons

\- Mockups

\- Brand assets

\- Documentation images



\---



\## docs/



Contains all project documentation.



Documentation evolves together with the application and should always reflect the current implementation.



\---



\## release/



Contains generated release artifacts.



Examples include:



\- APK

\- AAB

\- Release notes

\- Screenshots for distribution



Generated files should not be committed unless intentionally archived.



\---



\## test-data/



Contains sample datasets used during development and testing.



Examples include:



\- Sample images

\- JSON examples

\- Database snapshots

\- Import/export test files



No personal or production data should ever be stored in this directory.



\---



\## Repository Principles



The repository should remain organized and predictable.



Documentation, source code, assets, and generated files should remain clearly separated.



\---



\# 12. Coding Standards



To maintain a clean, readable, and maintainable codebase, all source code shall follow the coding standards defined below.



Consistency is preferred over personal coding style.



\---



\## General Principles



The codebase should always prioritize:



\- Readability

\- Simplicity

\- Maintainability

\- Predictability



Code is written once but read many times.



\---



\## Naming Conventions



\### Packages



Package names shall use lowercase letters only.



Example:



```

ui.home

data.local

navigation

```



\---



\### Classes



Class names shall use PascalCase.



Examples:



\- Observation

\- HomeScreen

\- ObservationRepository



\---



\### Functions



Function names shall use camelCase.



Examples:



\- saveObservation()

\- deleteObservation()

\- loadImages()



\---



\### Variables



Variables shall use meaningful camelCase names.



Avoid abbreviations unless universally understood.



Good:



```

observationDate

selectedCategory

```



Avoid:



```

obs

cat

tmp

```



\---



\## Compose Guidelines



Composable functions shall:



\- Have descriptive names.

\- Remain focused on a single responsibility.

\- Receive state through parameters.

\- Avoid direct business logic.



Example:



```

ObservationCard()

```



instead of



```

Card1()

```



\---



\## File Organization



Each Kotlin file should contain one primary class or composable whenever practical.



Large files should be split into smaller, focused files.



\---



\## Function Size



Functions should remain short and easy to understand.



As a general guideline:



\- Prefer functions under 50 lines.

\- Extract repeated logic into reusable functions.



\---



\## Comments



Comments should explain \*\*why\*\*, not \*\*what\*\*.



Avoid obvious comments.



Good:



```kotlin

// Cache the last known location to reduce battery usage.

```



Avoid:



```kotlin

// Increment counter.

counter++

```



\---



\## Magic Numbers



Avoid hardcoded values.



Meaningful constants should be extracted whenever appropriate.



Good:



```kotlin

private const val MAX\_IMAGE\_COUNT = 10

```



\---



\## State Management



UI state should be immutable whenever possible.



Compose screens should display state rather than own business logic.



\---



\## Coroutines



Suspend functions should be used for asynchronous work.



Blocking the main thread is never acceptable.



\---



\## Error Handling



Errors should be handled gracefully.



The application should avoid crashes caused by expected user actions or invalid input.



\---



\## Formatting



Use the default Kotlin formatting provided by Android Studio.



Manual formatting should not conflict with the official Kotlin style guide.



\---



\## AI Code Generation



AI-assisted code generation is encouraged.



However:



\- Generated code must be reviewed before being committed.

\- Readability is more important than brevity.

\- AI-generated code should follow the same standards as manually written code.









