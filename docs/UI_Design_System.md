\## Brand Personality



Nature Archive is:



\- Calm

\- Trustworthy

\- Professional

\- Curious

\- Respectful of Nature

\- Minimal



\# Nature Archive UI Design System



Version: 1.0



\---



\# 1. Design Philosophy



Nature Archive is designed as a calm, premium, and distraction-free experience for people who enjoy spending time in nature.



The interface should never compete with the user's photographs.



Instead, it should quietly support the experience of recording and revisiting observations.



\---



\## Core Values



The design language is based on five principles:



\- Simplicity

\- Consistency

\- Readability

\- Calmness

\- Longevity



Every screen should reflect these values.



\---



\## User Experience Goals



Users should feel that the application is:



\- Natural

\- Lightweight

\- Reliable

\- Comfortable

\- Professional



The interface should encourage exploration rather than demand attention.



\---



\## Design Priorities



When making design decisions, follow this order of priority:



1\. Usability

2\. Readability

3\. Consistency

4\. Performance

5\. Visual polish



Beautiful interfaces should never reduce usability.



\---



\## Design Language



Nature Archive follows a modern Material Design 3 foundation with carefully selected customizations.



The interface should avoid excessive decoration, unnecessary animations, and visual clutter.



Whitespace is considered an intentional design element.



\---



\## Premium Feel



A premium interface is achieved through refinement rather than complexity.



This includes:



\- balanced spacing

\- consistent typography

\- restrained color usage

\- smooth interactions

\- predictable layouts



Premium does not mean crowded.



Premium means thoughtful.



\---



\# 2. Color System



Nature Archive uses a carefully selected color palette inspired by forests, earth, and natural landscapes.



Colors should communicate hierarchy and meaning without overwhelming the user.



The interface should feel calm and timeless.



\---



\## Brand Palette



| Role | Purpose |

|------|---------|

| Primary | Forest Green |

| Secondary | Earth Brown |

| Tertiary | Moss Green |

| Accent | Soft Amber |

| Background | Warm White |

| Surface | Soft White |

| Error | Material Red |

| Success | Natural Green |

| Warning | Amber |



\---



\## Color Usage



Primary colors should be used sparingly to draw attention to important actions.



Neutral backgrounds should dominate the interface.



Nature photography should remain the visual focus.



\---



\## Surface Hierarchy



The application should rely on subtle elevation rather than strong color differences.



Preferred order:



Background



↓



Surface



↓



Surface Container



↓



Surface Container High



↓



Primary Action



\---



\## Dark Theme



Dark mode should preserve the calm feeling of the application.



Avoid pure black backgrounds.



Use dark green-gray surfaces instead.



\---



\## Accessibility



Text and interactive components shall always maintain sufficient contrast.



Color alone should never communicate important information.



Icons, labels, or supporting text should reinforce meaning.



\---



\# 3. Typography



Typography plays a central role in the Nature Archive experience.



The interface should be easy to read in bright outdoor environments as well as in dark mode.



Text should establish a clear visual hierarchy without relying on excessive font sizes or weights.



\---



\## Typography Principles



Typography should always prioritize:



\- Readability

\- Consistency

\- Accessibility

\- Simplicity



Text should never compete with the user's photographs.



\---



\## Type Scale



Nature Archive follows the Material Design 3 typography scale.



The primary text styles are:



| Style | Typical Usage |

|---------|--------------|

| Display | Splash screens, onboarding (future) |

| Headline | Screen titles |

| Title | Cards, dialogs, section headers |

| Body | Primary reading content |

| Label | Buttons, chips, metadata |



\---



\## Font Weight



Preferred weights:



\- Regular

\- Medium

\- SemiBold



Avoid excessive use of bold text.



Bold should communicate importance rather than decoration.



\---



\## Text Alignment



Default alignment is:



Left-aligned



Centered text should only be used for:



\- Empty states

\- Welcome messages

\- Splash screen

\- Success screens



\---



\## Line Length



Paragraphs should remain comfortable to read.



Avoid very long text blocks.



Break large content into smaller sections whenever practical.



\---



\## Text Hierarchy



Every screen should clearly communicate:



1\. Screen title

2\. Section title

3\. Primary content

4\. Secondary information

5\. Metadata



Users should immediately understand where to focus.



\---



\## Outdoor Readability



Since Nature Archive is primarily used outdoors:



\- Font sizes should never be unnecessarily small.

\- Low-contrast text should be avoided.

\- Important information should remain readable under direct sunlight.



\---



\## Accessibility



The application should respect the user's preferred system font scaling whenever practical.



Text should never become truncated due to fixed-size layouts.



\---



\# 4. Spacing System



Nature Archive follows an 8dp spacing grid to ensure consistency across all screens.



Using a standardized spacing system creates a cleaner interface, improves readability, and simplifies future UI development.



\---



\## Spacing Scale



The application uses the following spacing values:



| Token | Value | Typical Usage |

|--------|-------|---------------|

| XS | 4dp | Tight spacing between related elements |

| SM | 8dp | Small padding and gaps |

| MD | 16dp | Default internal padding |

| LG | 24dp | Space between sections |

| XL | 32dp | Large layout separation |

| XXL | 48dp | Empty state spacing |

| HERO | 64dp | Major screen sections |



Only these spacing values should be used unless a specific design requirement exists.



\---



\## Screen Padding



Default horizontal screen padding:



\*\*16dp\*\*



Large screens and tablets may increase padding in future versions.



\---



\## Vertical Rhythm



Content should follow a consistent vertical rhythm.



Typical spacing:



\- Headline → Subtitle: \*\*8dp\*\*

\- Subtitle → Content: \*\*24dp\*\*

\- Card → Card: \*\*16dp\*\*

\- Section → Section: \*\*32dp\*\*

\- Button → Content: \*\*24dp\*\*



Consistent spacing improves scanning and visual balance.



\---



\## Card Spacing



Cards should maintain:



\- Internal padding: \*\*16dp\*\*

\- External spacing: \*\*16dp\*\*

\- Corner radius defined in the Components section



Cards should never touch each other directly.



\---



\## List Spacing



Lists should use:



\- Item spacing: \*\*8dp\*\*

\- Section spacing: \*\*24dp\*\*

\- Comfortable scrolling without excessive whitespace



\---



\## Empty States



Empty state illustrations or icons should be separated from text by \*\*16dp\*\*.



Primary messages should have clear visual emphasis.



Supporting text should maintain comfortable spacing beneath the headline.



\---



\## Future Design Tokens



All spacing values should eventually be centralized in a shared `Dimensions` object to avoid hardcoded values throughout the codebase.



Until then, developers should follow the spacing scale defined in this document.



\---



\# 5. Components



Nature Archive uses a consistent set of reusable UI components.



Every component should follow the same visual language across the entire application.



Components should prioritize usability, readability, and consistency over visual complexity.



\---



\## 5.1 Cards



Cards are the primary content container throughout the application.



They are used for:



\- Observations

\- Search results

\- Categories

\- Statistics

\- Empty states



\### Guidelines



\- Rounded corners

\- Comfortable internal padding

\- Subtle elevation

\- No excessive shadows

\- Consistent spacing from surrounding content



Cards should never feel crowded.



\---



\## 5.2 Buttons



Buttons represent primary user actions.



\### Primary Button



Used for:



\- New Observation

\- Save

\- Export

\- Confirm



Characteristics:



\- Filled

\- Full width when appropriate

\- Primary color

\- Clear action label



\---



\### Secondary Button



Used for:



\- Cancel

\- Back

\- Skip

\- Less important actions



Outlined or tonal appearance is preferred.



\---



\### Text Button



Used only for lightweight actions.



Examples:



\- Learn More

\- Retry

\- View Details



\---



\## 5.3 Top App Bar



Every screen should include a consistent Top App Bar unless a full-screen experience requires otherwise.



The Top App Bar should contain:



\- Screen title

\- Optional navigation icon

\- Optional action icons



Avoid overcrowding the action area.



\---



\## 5.4 Floating Action Button (FAB)



The Floating Action Button represents the most important action on a screen.



Nature Archive uses only one FAB per screen.



Typical usage:



\- Add Observation



FABs should never compete with other primary actions.



\---



\## 5.5 Text Fields



Text fields should be simple and easy to scan.



Use:



\- Filled Material 3 text fields

\- Clear labels

\- Helpful placeholders only when necessary



Avoid unnecessary helper text.



\---



\## 5.6 Lists



Lists should present information in a predictable order.



Each list item should have:



\- Clear title

\- Optional subtitle

\- Optional thumbnail

\- Optional trailing action



Touch targets should remain comfortable.



\---



\## 5.7 Dialogs



Dialogs should be used sparingly.



Suitable use cases:



\- Confirm deletion

\- Discard changes

\- Permission explanations



Dialogs should always provide a clear primary action.



\---



\## 5.8 Chips



Chips represent metadata and filters.



Examples:



\- Mushroom

\- Bird

\- Tree

\- Flower

\- Favorite



Avoid placing too many chips on a single screen.



\---



\## 5.9 Snackbars



Snackbars communicate temporary feedback.



Examples:



\- Observation saved

\- Export completed

\- Photo deleted



Snackbars should automatically dismiss after a short duration.



Avoid using snackbars for critical errors.



\---



\## Component Consistency



Every reusable component should have a single implementation whenever practical.



Screens should reuse components instead of creating slightly different versions.



\---



\# 9. Motion \& Animation



Motion should enhance the user experience without distracting from the application's primary purpose.



Animations should feel natural, subtle, and responsive.



The user should notice the result of an action—not the animation itself.



\---



\## Motion Principles



Animations should be:



\- Fast

\- Smooth

\- Purposeful

\- Consistent



Avoid decorative animations.



Every animation should communicate feedback, continuity, or hierarchy.



\---



\## Screen Transitions



Screen transitions should remain subtle.



Navigation should feel fluid without slowing down the user.



Avoid exaggerated sliding or zooming effects.



\---



\## Component Animations



Small animations may be used for:



\- Expanding cards

\- Showing snackbars

\- Opening dialogs

\- Loading content

\- FAB transformations



Animations should never delay user interaction.



\---



\## Loading States



Loading indicators should appear only when necessary.



For short operations, prefer skeleton placeholders or immediate content updates instead of prolonged loading animations.



\---



\## Feedback



Interactive elements should provide visual feedback.



Examples include:



\- Button press states

\- Ripple effects

\- Selection highlights

\- Toggle transitions



Feedback should feel immediate and predictable.



\---



\## Performance



Animations should never compromise application performance.



Smooth interaction is more important than complex visual effects.



\---



\## Accessibility



Animations should respect the user's system accessibility preferences whenever possible.



Users who reduce motion at the operating system level should experience fewer non-essential animations.





\---



\# 10. Accessibility



Nature Archive is designed to be usable by as many people as possible in a wide range of outdoor environments.



Accessibility is considered a core design principle rather than an optional feature.



\---



\## Readability



Text should remain easy to read under varying lighting conditions.



The interface should maintain:



\- High contrast

\- Clear typography

\- Comfortable font sizes

\- Consistent spacing



Avoid low-contrast text for important information.



\---



\## Touch Targets



Interactive elements should provide comfortable touch areas.



Recommended minimum touch target:



48 × 48 dp



Small icons should receive additional padding if necessary.



\---



\## Color Usage



Color should never be the only indicator of meaning.



Whenever possible, combine colors with:



\- Icons

\- Labels

\- Supporting text



Users should understand the interface regardless of color perception.



\---



\## Font Scaling



The application should respect the user's preferred system font size whenever practical.



Layouts should adapt gracefully without clipping or overlapping text.



\---



\## Screen Reader Support



Interactive elements should include meaningful accessibility labels.



Buttons and icons should clearly describe their purpose.



Examples:



\- Add Observation

\- Open Map

\- View Photo

\- Search Observations



\---



\## Outdoor Usability



Because Nature Archive is primarily used outdoors:



\- High contrast is preferred.

\- Buttons should remain easy to tap.

\- Critical information should remain readable in direct sunlight.



Avoid relying on subtle visual differences.



\---



\## Error Prevention



Whenever practical, the interface should help users avoid mistakes before they happen.



Examples include:



\- Confirmation before deleting observations.

\- Validation of required fields.

\- Helpful guidance instead of technical errors.



\---



\## Accessibility Principles



The application should strive to be:



\- Inclusive

\- Predictable

\- Easy to navigate

\- Comfortable to use



Accessibility improvements should benefit all users, not only those with specific accessibility needs.





\---



\# 11. Design Tokens



Design Tokens define the reusable visual values that ensure consistency across the application.



Rather than hardcoding visual properties, the application should reference shared tokens whenever possible.



\---



\## Purpose



Design Tokens provide a single source of truth for common UI values such as:



\- Colors

\- Typography

\- Spacing

\- Corner Radius

\- Elevation

\- Icon Sizes



Using shared tokens improves consistency and simplifies future design updates.



\---



\## Planned Token Categories



The following token groups are planned for implementation:



| Token Group | Example |

|-------------|---------|

| Colors | Primary, Surface, Error |

| Typography | Headline, Title, Body |

| Spacing | XS, SM, MD, LG, XL |

| Shapes | Small, Medium, Large |

| Elevation | Level 0–5 |

| Icon Sizes | Small, Medium, Large |



\---



\## Compose Implementation



In future sprints, these tokens will be represented as reusable Kotlin objects within the theme package.



Examples include:



\- `Dimensions.kt`

\- `Shapes.kt`

\- `Typography.kt`



Developers should reference these shared definitions instead of hardcoded values.



\---



\## Consistency



Every screen should use the same design tokens.



Introducing custom values for individual screens should be avoided unless there is a clear design requirement.



Consistency is one of the key characteristics of a premium user experience.



\---



\## Future Expansion



As Nature Archive evolves, additional design tokens may be introduced to support:



\- Animations

\- Responsive layouts

\- Foldable devices

\- Tablet-specific adaptations



The token system should remain simple, scalable, and easy to maintain.







