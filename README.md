<img src="screenshots/preview.gif"/>

## Table of contents
1. [Introduction](#introduction)
2. [Structure](#structure)
3. [Architecture](#architecture)
4. [Responsabilities](#responsabilities)

## Introduction
This is an Android showcase project based on Pokémon.

The main goals of this project were to:
- Show how to create a design system compatible with multi-brand themes
- Try [Paparazzi](https://github.com/cashapp/paparazzi), an open source snapshot testing library developed by [Cash App](https://github.com/cashapp) team.

I chose to use Pokémon as an example because it was the perfect case of a multi-brand theme usage.</br>
Since the first generation of games were released, they always used the idea of creating basically one base game, but with different themed variants for the game's boxes and cartridges, as well as some other contents.

## Structure
```
.
├── app                   # Project sample (android-application)
├── buildSrc              # Dependency management with Kotlin DSL
├── component             # Design system components (android-libraries)
│   └── player
└── theme
    ├── base              # Base theme and attributes (android-library)
    └── brand             # Brand theme implementations (android-libraries)
        ├── blue
        ├── green
        ├── red
        └── yellow
```

## Architecture
![poke-themes Architecture](https://user-images.githubusercontent.com/35379633/152466454-28843616-3743-4874-9e6e-7f9d1844f28d.gif)

For the purpose of creating an actual sample, the project presents just one **android-application** module, which implements all four themes.</br>

In the image above, it is presented a scenario where multiple apps were meant to be created, each one of them with its respective theme.
