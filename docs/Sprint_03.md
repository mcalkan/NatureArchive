\# Sprint 03 — Observation Creation Foundation



\---



\## Sprint Goal



Introduce the first real user interaction by allowing navigation from the Home screen to a dedicated \*\*New Observation\*\* screen.



This sprint establishes the UI and navigation flow for creating observations without implementing data persistence, camera integration, GPS, or business logic.



\---



\## Motivation



Until Sprint 2, Nature Archive has focused on branding, navigation, and the overall user experience.



Sprint 3 marks the beginning of the application's core workflow.



For the first time, users will be able to enter the observation creation flow.



\---



\## Scope



Included in this sprint:



\- Add a new \*\*New Observation\*\* destination.

\- Extend the Navigation Graph.

\- Navigate from Home to New Observation.

\- Create the Observation screen UI.

\- Display the observation form.

\- Provide Back navigation.

\- Disable the Save action until persistence is implemented.



\---



\## Out of Scope



The following features are intentionally excluded:



\- Room Database

\- ViewModel

\- CameraX

\- Gallery

\- GPS / Location

\- Species identification

\- Maps

\- Export

\- Search

\- AI features



\---



\## Deliverables



At the end of Sprint 3 the application should allow:



Home



↓



New Observation



↓



Back to Home



The Observation screen will contain:



\- Observation title

\- Notes

\- Category selector (static)

\- Save button (disabled)

\- Cancel / Back navigation



\---



\## Files Expected



New:



\- ui/observation/NewObservationScreen.kt



Modified:



\- Routes.kt

\- NatureArchiveNavGraph.kt

\- HomeScreen.kt

\- strings.xml



Only if necessary:



\- NatureArchiveScaffold.kt



\---



\## Acceptance Criteria



\- Application builds successfully.

\- Home screen navigates to New Observation.

\- Observation screen follows the Nature Design System.

\- Navigation works correctly.

\- Save button is disabled.

\- No business logic is introduced.

\- No ViewModel is created.

\- No database code exists.



\---



\## Risks



Avoid introducing future architecture before it is required.



This sprint is strictly focused on navigation and UI.



\---



\## Sprint Result



\_To be completed after Sprint 3.\_



\---



\## Notes



Sprint 4 will introduce the first observation input behavior.



Persistence will not be added until the data layer sprint.

