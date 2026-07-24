\# Nature Archive — Project History



This document records the major milestones, architectural decisions, sprint history, and release timeline of the Nature Archive project.



It serves as the long-term engineering history of the project.



\---



\# Project Vision



Nature Archive is an offline-first Android application designed to help users document and preserve observations of nature.



The project emphasizes simplicity, long-term maintainability, and professional software engineering practices over rapid feature development.



\---



\# Core Engineering Principles



The project follows these principles throughout its lifecycle:



\- Offline First

\- Simplicity First

\- Incremental Architecture

\- Documentation First

\- Material 3 Design

\- Calm User Experience

\- Accessibility

\- No Premature Abstraction



\---



\# Documentation Timeline



The following core documentation has been completed.



| Document | Status |

|----------|--------|

| Software Design Document | ✅ Completed |

| UI Design System | ✅ Completed |

| Development Guidelines | ✅ Completed |

| Product Roadmap | ✅ Completed |

| Project Principles | ✅ Completed |

| Decisions | ✅ Active |

| Sprint Documents | ✅ Active |



\---



\# Milestones



\## Milestone 1



\### Project Foundation



Status



✅ Completed



Achievements



\- Android Studio project created.

\- Git repository initialized.

\- Initial application structure established.



Git



Initial commits



\---



\## Milestone 2



\### Documentation Phase



Status



✅ Completed



Achievements



\- Software Design Document completed.

\- UI Design System completed.

\- Development Guidelines completed.

\- Product Roadmap completed.

\- Project Principles completed.

\- Decisions document introduced.



Git Tag



v0.1.0-docs



\---



\## Milestone 3



\### Sprint 2



Home Screen



Status



✅ Completed



Achievements



\- Home Screen designed.

\- Empty State implemented.

\- Shared Scaffold improved.

\- Material 3 design language established.

\- Release documentation introduced.



Git Tag



v0.2.0-home



Release



/releases/v0.2.0-home/



\---



\## Milestone 4



\### Sprint 3



Observation Screen



Status



✅ Completed



Achievements



\- Navigation architecture expanded.

\- Observation creation screen added.

\- Static observation form implemented.

\- Project navigation pattern finalized.



Git Tag



v0.3.0-observation-ui



Release



/releases/v0.3.0-observation-ui/



\---



\## Milestone 5



\### Sprint 4



Interactive Observation Form



Status



✅ Completed



Achievements



\- Editable observation form.

\- rememberSaveable state.

\- Form validation.

\- Category selector.

\- Material 3 interaction improvements.



Git Tag



v0.4.0-interactive-observation-form



Release



/releases/v0.4.0-interactive-observation-form/



\---



\## Milestone 6



\### Sprint 5



Room Database Integration



Status



✅ Completed



Current Goal



Introduce local persistence using Room Database.



Current State



\- Architecture Proposal approved.

\- Copilot implementation completed.

\- Architecture review pending.

\- Build compatibility issue under investigation.



Known Issue



Android Gradle Plugin / Kotlin / KSP compatibility requires review before release.



Git Tag



Not created yet.



\---



\# Release History



| Version | Description | Status |

|----------|-------------|--------|

| v0.1.0-docs | Documentation milestone | ✅ |

| v0.2.0-home | Home Screen | ✅ |

| v0.3.0-observation-ui | Observation UI | ✅ |

| v0.4.0-interactive-observation-form | Interactive Form | ✅ |

| v0.5.0-room | Local Persistence | 🚧 |



\---



\# Important Architectural Decisions



The following long-term decisions have been adopted.



\## Documentation Before Code



Every sprint begins with documentation and architecture planning before implementation.



\---



\## Incremental Architecture



Architecture is introduced only when required by the roadmap.



No unnecessary abstraction is allowed.



\---



\## Repository Philosophy



Repositories remain intentionally small.



Features are introduced only when required by the current sprint.



\---



\## Offline First



All core functionality must continue working without internet connectivity.



\---



\## Release Process



Each completed sprint must include:



\- Git Commit

\- Git Tag

\- Git Push

\- Release Folder

\- Screenshots

\- CHANGELOG

\- Documentation Updates



\---



\# Future Milestones



Upcoming planned milestones include:



\- Observation List

\- Image Support

\- GPS Integration

\- Maps

\- Search

\- Filtering

\- Export / Import

\- Cloud Synchronization



These features will only be introduced according to the Product Roadmap.



\---



\# Lessons Learned



The project has adopted the following engineering workflow:



Documentation



↓



Architecture Proposal



↓



Architecture Review



↓



Implementation



↓



Code Review



↓



Testing



↓



Release



↓



Retrospective



This workflow has become a permanent part of the Nature Archive development process.



\---



Last Updated



Sprint 5 (In Progress)





\### Technical Note (Sprint 5)



During Sprint 5, a compatibility issue was encountered between

Android Studio Quail 2, AGP 9.3, Built-in Kotlin and KSP.



A temporary Gradle property



android.disallowKotlinSourceSets=false



was added to allow the project to build successfully.



This workaround will be reviewed and removed after the Android

toolchain stabilizes or an updated Room/KSP configuration is adopted.

