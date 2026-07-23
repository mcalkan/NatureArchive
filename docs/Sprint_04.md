\# Sprint 04 — Interactive Observation Form



\---



\## Sprint Goal



Transform the static Observation screen into an interactive form using Jetpack Compose state management.



This sprint focuses entirely on user interaction and form behavior without introducing data persistence or business logic.



\---



\## Motivation



Sprint 3 established the navigation flow and the Observation screen layout.



Sprint 4 improves the user experience by making the form interactive and responsive while keeping the implementation lightweight and purely UI-driven.



This sprint also introduces fundamental Jetpack Compose state management concepts that will serve as the foundation for future features.



\---



\## Scope



Included in this sprint:



\- Editable Observation Title

\- Editable Notes field

\- Interactive Category selector

\- Form state management using Compose

\- Basic form validation

\- Enable/disable Save button based on form validity

\- Preserve entered data during configuration changes using `rememberSaveable`



\---



\## Out of Scope



The following features are intentionally excluded:



\- Room Database

\- ViewModel

\- Repository

\- Hilt

\- Camera

\- Gallery

\- GPS

\- Image attachments

\- Saving observations

\- AI features



\---



\## Deliverables



At the end of Sprint 4 the Observation screen should provide:



\- Editable Title field

\- Editable Notes field

\- Category selection

\- Live form validation

\- Save button enabled only when required fields are valid

\- Back navigation



The Save button will not persist data.



\---



\## Files Expected



Modified:



\- ui/observation/NewObservationScreen.kt

\- strings.xml



Optional (only if required):



\- ui/components/\*

\- theme/\*



No new architectural layers should be introduced.



\---



\## Acceptance Criteria



\- Application builds successfully.

\- User can edit Title.

\- User can edit Notes.

\- User can change Category.

\- Save button reacts to form state.

\- Form state survives screen rotation.

\- No data is saved.

\- No ViewModel exists.

\- No Room code exists.



\---



\## Technical Goals



This sprint introduces:



\- remember

\- rememberSaveable

\- mutableStateOf

\- derivedStateOf

\- ExposedDropdownMenuBox

\- Material 3 form components



The implementation should remain simple and readable.



\---



\## Risks



Avoid introducing future architecture before it is needed.



Do not create:



\- Repository

\- Data layer

\- Validation framework

\- Form abstraction

\- Generic UI framework



Keep everything local to the Observation screen.



\---



\## Sprint Result



\_To be completed after Sprint 4.\_



\---



\## Notes



Sprint 5 will introduce the local persistence layer using Room.



The UI created in Sprint 4 should require minimal modification when persistence is added.

