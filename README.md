# Week 2 Project 2: Kotlin Debug-a-thon

Hey there! This project was a deep dive into debugging Kotlin Android applications. My main goal was to take a broken starter app and bring it back to life by fixing various bugs in the Kotlin code. It was a fantastic learning experience, really boosting my confidence in tackling Android development challenges!

## Project Walkthrough

I've put together a quick video demonstrating the fixed app in action, showing all the features working smoothly after my debugging efforts.

**[Watch the full project walkthrough video here!](https://i.imgur.com/a/tNtOMbt.gif)**

---

## What I Fixed (Required Features Checklist)

Here’s a rundown of all the core app features that were successfully debugged and are now working as expected:

- [x] Debugged and fixed navigation to the **Hello World** activity.
- [x] Debugged and fixed the **Number Sum (2 + 2)** activity.
- [x] Debugged and fixed the **Current Day** activity.
- [x] Debugged and fixed the behavior of the **Random Color** activity.
- [x] Debugged and fixed the **Print List** activity.
- [x] Debugged and fixed the **Favorite Number** activity.

---

## A Note on Technical Hurdles During Submission

This project came with its own set of unexpected challenges, especially around the submission process, which I wanted to briefly mention. It added a bit of extra time to getting everything in:

* **Submission Portal Troubles:** At a really critical time, the course submission portal itself was giving me a **404 Not Found error**. This was super frustrating and definitely held things up.
* **Git Push Permissions:** I hit a snag early on trying to push my code. Android Studio was throwing a `Permission denied` (HTTP 403) error because I was trying to push directly to the Codepath starter repository. Figuring out how to reconfigure my local Git remote URL to point to my own personal fork solved that!
* **Android Studio's Git UI Acting Up:** The "Commit" window in Android Studio gave me a bit of a headache; it just wouldn't show the list of changed files visually. This meant I had to commit and push my changes directly from the integrated terminal (using `git add .`, `git commit -m "..."`, and `git push`), which bypassed the UI glitch.
* **Emulator Instability:** Early in the project, the Android emulator was pretty unstable, crashing or failing to launch consistently. I spent some time troubleshooting with cold boots and recreating AVDs, but ultimately, switching to testing on my physical device was the best solution for reliable and faster iteration.

Despite these environmental and technical hiccups, I pushed through to ensure the application was fully functional and submitted. It was quite the debug-a-thon, both in the code and outside of it!

---
