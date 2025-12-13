<p align="center">
  <img src="logo.png" alt="Logo"/>
</p>


<p align="center">
  <a href="https://www.minecraft.net/"><img src="https://img.shields.io/badge/Minecraft-1.20+-blue.svg" alt="Minecraft Version"/></a>
  <a href="https://fabricmc.net/"><img src="https://img.shields.io/badge/Fabric-API-green.svg" alt="Fabric API"/></a>
  <a href="https://www.java.com/"><img src="https://img.shields.io/badge/Java-21-brightgreen.svg" alt="Java Version"/></a>
  <a href="LICENSE"><img src="https://img.shields.io/badge/License-Apache%202.0-blue.svg" alt="License"/></a>
</p>

---

## Overview

**NoJumpDelay** is a small **Minecraft client-side mod** (Fabric) that removes the built-in jump delay, allowing instant consecutive jumps.  
This mod improves movement responsiveness, especially in **PvP** and intense gameplay scenarios.  
It includes a **simple on/off toggle** for easy control.

---

## Features

- Instantly jump without Minecraft's default cooldown.
- Works client-side only; no server modifications required.
- Toggleable via a configurable key.
- Action bar indicator shows mod status.
- Lightweight and minimal dependencies.

---

## Installation

### Requirements

- Minecraft **1.21+**
- [Fabric Loader](https://fabricmc.net/use/) installed
- [Fabric API](https://www.curseforge.com/minecraft/mc-mods/fabric-api)
- Java **21** or higher

### Steps

1. Download the latest `NoJumpDelay-X.X.X.jar` from the [Releases](https://github.com/kizio806/No-Jump-Delay/releases) page.
2. Place the `.jar` file into your `mods` folder.
3. Start Minecraft with Fabric Loader.
4. Use the toggle key to enable or disable the mod.

---

## Development

This project uses **Gradle** as a build system.  

### Build from Source

```bash
git clone https://github.com/yourusername/No-Jump-Delay.git
cd No-Jump-Delay
./gradlew build
```
- Compiled `.jar` files will be in `build/libs/`.
- Requires **Java 21** and **Fabric API**.

---

## Contributing

Contributions are welcome! Please follow these guidelines:

- Fork the repository
- Create a new branch for your feature/fix
- Submit a pull request with a clear description
- Keep commits clean and well-named (`feat:`, `fix:`, `chore:`)

---

## Author

**Your Name / GitHub username**  
[GitHub Profile](https://github.com/kizio806)

---

## License

This project is licensed under the **MIT License**. See [LICENSE](LICENSE) for details.
