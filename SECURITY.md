# Security Policy

## Supported Versions

This project is a small educational repository and does not publish formal release branches.

Security updates are handled on the `main` branch.

| Version | Supported |
| ------- | --------- |
| `main`  | Yes       |

## Reporting a Vulnerability

If you find a security issue, please do not open a public issue.

Instead, report it privately using GitHub's private vulnerability reporting or Security Advisories feature, if available for this repository.

If private reporting is not available, open a minimal public issue that says you would like to report a security concern, but do not include exploit details, proof-of-concept code, secrets, or sensitive output in the issue.

Please include:
- A short description of the issue.
- Steps to reproduce the behavior.
- The potential impact.
- Any affected files, commands, or configurations.
- Suggested fixes, if you have them.

## What to Expect

After a report is received:
1. The issue will be reviewed to confirm whether it affects this repository.
2. If confirmed, a fix will be prepared on `main`.
3. Credit can be included in the fix or release notes if you want it.

Because this is a small learning project, response times may vary. Security reports will still be treated with care and prioritized over normal feature work.

## Scope

Security concerns that may be relevant include:
- Unsafe Docker or CI configuration.
- Accidental exposure of secrets.
- Dependency or runtime issues that affect how the project is built or executed.
- Any behavior that could surprise contributors running the project locally.

General FizzBuzz behavior bugs, documentation issues, and test failures should be reported using the normal issue templates.
