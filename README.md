<div align="center">
  <h1 align="center">FizzBuzz</h1>
  <p align="center">
    The most overcomplicated way to solve the FizzBuzz problem.
  </p>
  <p align="center">
    <a href="https://github.com/joe-huber/Overcomplicated-FizzBuzz-Solution/blob/main/LICENSE">
      <img alt="License" src="https://img.shields.io/github/license/joe-huber/Overcomplicated-FizzBuzz-Solution">
    </a>
    <a href="https://github.com/joe-huber/Overcomplicated-FizzBuzz-Solution/issues">
      <img alt="Issues" src="https://img.shields.io/github/issues/joe-huber/Overcomplicated-FizzBuzz-Solution">
    </a>
    <a href="https://github.com/joe-huber/Overcomplicated-FizzBuzz-Solution/network/members">
      <img alt="Forks" src="https://img.shields.io/github/forks/Joe-Huber/Overcomplicated-FizzBuzz-Solution">
    </a>
    <a href="https://github.com/joe-huber/Overcomplicated-FizzBuzz-Solution/stargazers">
      <img alt="Stars" src="https://img.shields.io/github/stars/joe-huber/Overcomplicated-FizzBuzz-Solution">
    </a>
    <a href ="https://github.com/Joe-Huber/Overcomplicated-FizzBuzz-Solution/actions/workflows/ci.yml">
      <img alt="Status" src="https://github.com/Joe-Huber/Overcomplicated-FizzBuzz-Solution/actions/workflows/ci.yml/badge.svg">
    </a>
    <a href ="https://github.com/Joe-Huber/Overcomplicated-FizzBuzz-Solution">
      <img alt="Top Language" src="https://img.shields.io/github/languages/top/Joe-Huber/Overcomplicated-FizzBuzz-Solution">
    </a>
    <a href ="https://github.com/Joe-Huber/Overcomplicated-FizzBuzz-Solution">
      <img alt="Code Size" src="https://img.shields.io/github/languages/code-size/Joe-Huber/Overcomplicated-FizzBuzz-Solution">
    </a>
    <a href="https://img.shields.io/github/last-commit/Joe-Huber/Overcomplicated-FizzBuzz-Solution">
      <img alt ="Last Commit" src="https://img.shields.io/github/last-commit/Joe-Huber/Overcomplicated-FizzBuzz-Solution">
    </a>
  </p>
</div>

---

## Table of Contents
- [Overview](#overview)
- [How it works](#how-it-works)
- [Requirements](#requirements)
- [Quick start](#quick-start)
- [Example output (1..15)](#example-output-115)
- [Project layout](#project-layout)
- [Continuous Integration](#continuous-integration)
- [Extending rules](#extending-rules)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)

## Overview
This is an intentionally over‑engineered implementation of the classic FizzBuzz problem. It highlights a common 
real-world pitfall: **without a defined scope, you have no idea how "quality" to make your solution.** 
Should FizzBuzz be a couple of if statements? A microservice? A distributed system with CI/CD, weighted rule engines, 
and Dockerized test suites? Without requirements, all of those answers are equally valid, and equally absurd. 
This project leans into the absurdity on purpose.

## How it works
- FizzBuzz prints numbers from 1 to n.
- If a number is divisible by a rule's key (divisor), the rule's value (string) is appended to the output.
- When multiple rules match, they are ordered by their weight (lower weight = earlier in the output), then concatenated.

Default rules (defined inside FizzBuzz.fizzBuzz):
- 3 -> "Fizz" (weight 1)
- 5 -> "Buzz" (weight 2)

The ordering by weight ensures, for example, that for 15 both rules match and produce "FizzBuzz" in the expected order.

Key classes:
- src/main/java/FizzBuzz.java — main implementation and a tiny demo entry point.
- src/main/java/FizzRule.java — a record that stores key, value, and weight and implements Comparable by weight.
- src/main/java/FizzBuzzTests.java — self‑contained tests that validate expected output over several ranges.
- src/main/java/TestResult.java — small helper type used by the tests to report pass/fail.

## Requirements
Choose either setup:
- Docker (recommended for a zero‑setup run)
- OR Java 17+ (e.g., Eclipse Temurin 17)

## Quick start
Option A — Docker
1) Build the test image

```bash
docker build -t fizzbuzz-test .
```

2) Run the test suite (container exits non‑zero on failures)

```bash
docker run --rm fizzbuzz-test
```

Option B — Local Java
From the repository root:
1) Compile

```bash
javac -d . src/main/java/*.java
```

2) Run tests

```bash
java main.java.FizzBuzzTests
```

3) (Optional) Run the demo program

```bash
java main.java.FizzBuzz
```

## Example output (1..15)
If you modify the demo to call fizzBuzz(15), the output would be:

```text
1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz
```

## Project layout
- src/main/java/FizzBuzz.java
- src/main/java/FizzBuzzTests.java
- src/main/java/FizzRule.java
- src/main/java/TestResult.java
- Dockerfile
- .github/workflows/ci.yml

## Continuous Integration
A GitHub Actions workflow (Java CI) builds a Docker image and runs the test suite on pushes and PRs to main. 
The Badge is visible at the top of this README.

## Extending rules
Rules are currently created inside FizzBuzz.fizzBuzz. To experiment, you can change the defaultRules array in that
method. For example, to add a rule for 7:
- new FizzRule(7, "Bazz", 3)
Make sure to give it an appropriate weight so the concatenation order matches your preference.

## Troubleshooting
- java: command not found — Install Java 17+ (e.g., Eclipse Temurin) or use the Docker path instead.
- docker: permission denied / not found — Ensure Docker Desktop (macOS/Windows) or Docker Engine (Linux) is installed and running.
- Tests fail locally — Recompile cleanly (remove old .class files or compile to a fresh directory) and ensure you are in the repo root when running java main.java.FizzBuzzTests.

## Contributing
Issues and PRs welcome! This project is for fun and learning—clear test coverage and small, focused changes are appreciated.

## License
This project is licensed under the MIT License — see the LICENSE file for details.
