# Social Spark 🌟

A native Android app built with Kotlin for IMAD5112 Assignment 1.

## About The App

Social Spark is an app designed for Cora, a fictional friend who wants to stay socially connected. The app takes a time of day as input and suggests a fun social activity to help Cora reach out to the people she cares about.

## How To Use

1. Type one of the following times of day into the text field:
   - Morning
   - Mid-morning
   - Afternoon
   - Afternoon Snack Time
   - Dinner
   - After Dinner or Night
2. Tap **Get My Spark!** to see your social suggestion
3. Tap **Reset** to clear everything and start again

If you enter something invalid, the app will prompt you to enter a valid time of day.

## Social Spark Suggestions

| Time of Day | Suggestion |
|---|---|
| Morning | Send a Good Morning text to a family member |
| Mid-morning | Reach out to a colleague with a quick Thank you |
| Afternoon | Share a funny meme or interesting link with a friend |
| Afternoon Snack Time | Send a quick Thinking of you message |
| Dinner | Call a friend or relative for a 5-minute catch-up |
| After Dinner / Night | Leave a thoughtful comment on a friend's post |

## Design Considerations

- Simple and clean UI using a LinearLayout with a calming blue colour scheme
- Large, easy-to-read text and clearly labelled buttons
- Input is trimmed and converted to lowercase so capitalisation does not affect results
- Error handling displays a helpful message for unrecognised input
- Reset button clears both the input field and the suggestion

## GitHub Actions

This project uses GitHub Actions for automated CI (Continuous Integration). Every time code is pushed to the main branch, the workflow automatically builds the project using Gradle on an Ubuntu runner with JDK 17. This ensures the code compiles correctly after every change.

## Video Demo

*Coming soon — link will be added here*

## Author

Saiyen Govender — ST10513284
