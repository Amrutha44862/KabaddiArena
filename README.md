# 🏉 Kabaddi Arena — Your Personal Performance Scout

> An Android application built in Kotlin to track Kabaddi match performance in real time, compute statistics, and help rural players get discovered by professional scouts.

---

## 📋 Table of Contents

- [About the Project](#about-the-project)
- [Problem Statement](#problem-statement)
- [Features](#features)
- [Tech Stack](#tech-stack)
- [App Architecture](#app-architecture)
- [Screens](#screens)
- [Getting Started](#getting-started)
- [Project Structure](#project-structure)
- [Future Enhancements](#future-enhancements)
- [Internship Details](#internship-details)
- [Author](#author)

---

## 📌 About the Project

**Kabaddi Arena** is an Android mobile application that digitises local (Matti/village-level) Kabaddi tournament data. It allows coaches or players to record live match statistics — raids, empty raids, tackles, and scores — for both teams in real time, automatically calculates match results, and maintains a full performance history.

The app addresses the gap between rural Kabaddi talent and professional scouting by creating a permanent, data-backed performance record for every player.

---

## ❗ Problem Statement

| Problem | Impact |
|---|---|
| Zero performance data | Players finish matches without knowing their raid success % or tackle efficiency |
| Invisible to scouts | Pro Kabaddi scouts cannot discover rural talent without digitised stats |
| No affordable tool | Existing apps only serve professional teams, not individual village players |

---

## ✅ Features

- 🔐 **User Authentication** — Secure login & signup using SharedPreferences (offline, no internet needed)
- 📊 **Live Match Scoring** — Real-time +/- buttons for Score, Raids, Empty Raids & Tackles for both teams
- 🏆 **Score Card** — Post-match summary with final scores, Win/Loss/Draw result and full stats
- 📈 **Statistics Screen** — Full match history: total matches, wins, draws, highest score, win rate %, last result
- 🔄 **Reset & Undo** — Reset all counters instantly during a live match
- 💾 **Offline Storage** — All data saved locally using SharedPreferences, no internet required
- 🗑️ **Clear Statistics** — Option to reset all historical match data

---

## 🛠️ Tech Stack

| Technology | Purpose |
|---|---|
| **Kotlin** | Primary programming language for all Activity classes and business logic |
| **Android Studio** | Official IDE for development, debugging and testing |
| **ViewBinding** | Type-safe and null-safe access to all XML UI elements |
| **Material Design** | Google's UI component library — dark theme with orange accent |
| **SharedPreferences** | Local key-value storage for login credentials and match statistics |
| **Intents & Extras** | Screen-to-screen navigation and data passing between Activities |
| **GitHub** | Version control and source code hosting |
| **GitHub Desktop** | GUI tool for committing and pushing code |

---

## 🏗️ App Architecture

The app follows **Activity-Based MVC** architecture:

```
Model      →  SharedPreferences (persistent data) + Intent Extras (live match data)
View       →  XML Layout files (one per screen)
Controller →  Kotlin Activity classes (business logic + UI interaction)
```

### Navigation Flow

```
LoginActivity
     ↓
HomeActivity
     ↓
MatchScoreActivity
     ↓
ScoreCardActivity
     ↓
StatisticsActivity
```

> Data is passed from **MatchScoreActivity → ScoreCardActivity** via Intent Extras.  
> Cumulative stats are saved to **SharedPreferences** by ScoreCardActivity and read by StatisticsActivity.

---

## 📱 Screens

### 1. Login / Signup Screen
- Email and password fields with validation
- Minimum 6-character password check
- Credentials stored in SharedPreferences
- Auto-login for returning users

### 2. Home Dashboard
- Personalised welcome message with username
- Navigate to Start Match or View Statistics
- Logout option

### 3. Live Match Score Screen
- +/- buttons for Score, Raids, Empty Raids, Tackles — for both Team 1 and Team 2
- All counters update instantly in real time
- Reset button clears all counters to zero
- End Match button sends all data to Score Card screen

### 4. Score Card Screen
- Receives all match data via Intent Extras
- Displays final scores, raid/tackle counts per team
- Computes result: **Win / Loss / Draw**
- Auto-saves match result to SharedPreferences

### 5. Statistics Screen
- Reads all stats from SharedPreferences
- Displays: Total Matches, Team Wins, Draws, Highest Score, Win Rate %, Last Match Result
- Clear Statistics button resets all data

---

## 🚀 Getting Started

### Prerequisites

- Android Studio (latest version recommended)
- Android SDK (minimum API level 21 — Android 5.0 Lollipop)
- Kotlin plugin (bundled with Android Studio)

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/YOUR_USERNAME/kabaddi-arena.git
   ```

2. **Open in Android Studio**
   ```
   File → Open → Select the cloned folder
   ```

3. **Enable ViewBinding** (already configured in build.gradle)
   ```gradle
   android {
       buildFeatures {
           viewBinding true
       }
   }
   ```

4. **Run the app**
   - Connect an Android device or start an emulator
   - Click **Run ▶** or press `Shift + F10`

---

## 📁 Project Structure

```
KabaddiArena/
├── app/
│   ├── src/
│   │   └── main/
│   │       ├── java/com/example/kabaddiarena/
│   │       │   ├── LoginActivity.kt
│   │       │   ├── HomeActivity.kt
│   │       │   ├── MatchScoreActivity.kt
│   │       │   ├── ScoreCardActivity.kt
│   │       │   └── StatisticsActivity.kt
│   │       ├── res/
│   │       │   ├── layout/
│   │       │   │   ├── activity_login.xml
│   │       │   │   ├── activity_home.xml
│   │       │   │   ├── activity_match_score.xml
│   │       │   │   ├── activity_score_card.xml
│   │       │   │   └── activity_statistics.xml
│   │       │   ├── drawable/
│   │       │   └── values/
│   │       │       ├── colors.xml
│   │       │       ├── strings.xml
│   │       │       └── themes.xml
│   │       └── AndroidManifest.xml
│   └── build.gradle
└── README.md
```

---

## 🔮 Future Enhancements

- [ ] **GenAI Coaching** — Gemini AI-powered post-match coaching recommendations
- [ ] **Firebase Cloud Sync** — Multi-device access and cloud backup
- [ ] **Room Database** — Structured offline storage for complex match data
- [ ] **Scout Portal** — Web portal where Pro Kabaddi scouts can search player profiles
- [ ] **Player Heatmap** — Visual court map showing raid and tackle positions
- [ ] **Tournament Management** — Bracket and scheduling for multi-team tournaments
- [ ] **Performance Card Sharing** — Share stats card directly to WhatsApp/Instagram

---

## 🎓 Internship Details

| Field | Details |
|---|---|
| **Organization** | MindMatrix, Bengaluru |
| **Domain** | Android App Development · Sports Technology · GenAI Analytics |
| **College** | Gopalan College of Engineering & Management |
| **Department** | Computer Science & Engineering |
| **Guide** | Dr. Subrahmanya H M |

---

## 👩‍💻 Author

**Amrutha D R**  
USN: 1GD22CS005  
B.E. Computer Science & Engineering  
Gopalan College of Engineering & Management, Bengaluru

---

## 📄 License

This project was developed as part of an internship program at MindMatrix, Bengaluru.  
© 2025 Amrutha D R. All rights reserved.

---

*Built with ❤️ for rural Kabaddi players across India.*
