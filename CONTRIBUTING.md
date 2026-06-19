# Contributing

Thanks for your interest in contributing to this intentionally overcomplicated FizzBuzz project.

This repo is for fun and learning, but the best contributions are still clear, focused, and easy to review.

## What to Contribute

Good contributions include:
- Bug fixes with a clear reproduction case.
- Small improvements to the FizzBuzz rules or test coverage.
- Documentation updates that make the project easier to run or understand.
- CI, Docker, or workflow improvements that keep the project simple to use.

Please avoid broad rewrites unless there is a clear reason for them.

## Before You Start

1. Check the existing issues and pull requests.
2. Open an issue for larger changes before writing code.
3. Keep changes small and focused.

## Development Setup

You can run the project with Docker or local Java.

### Docker

Build the test image:

```bash
docker build -t fizzbuzz-test .
```

Run the test suite:

```bash
docker run --rm fizzbuzz-test
```

### Local Java

Compile from the repository root:

```bash
javac -d . src/main/java/*.java
```

Run the tests:

```bash
java main.java.FizzBuzzTests
```

Run the demo program:

```bash
java main.java.FizzBuzz
```

## Testing

Before opening a pull request, run the Docker test path if possible:

```bash
docker build -t fizzbuzz-test .
docker run --rm fizzbuzz-test
```

If you cannot run tests locally, mention that in your pull request and explain why.

## Pull Requests

When opening a pull request:
- Describe what changed and why.
- Include testing notes.
- Update documentation if usage or behavior changed.
- Keep the PR focused on one idea.

GitHub Actions will build the Docker image and run the test suite on pull requests to `main`.

## Issues

Use the issue templates when possible:
- Bug reports should include steps to reproduce, expected behavior, actual behavior, and relevant output.
- Feature requests should include motivation, a proposed solution, and testing notes.

## Code Style

This project uses plain Java with a deliberately small structure. Prefer readable code and simple tests over extra abstraction.

When adding or changing FizzBuzz behavior, update `src/main/java/FizzBuzzTests.java` so the expected output stays clear.
