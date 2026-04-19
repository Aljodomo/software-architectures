# Software Architectures - Comparison

A Spring Boot + Kotlin project implementing the same task management API across 7 different architectural styles.

## Domain

All architectures expose the same two endpoints for a `Task` (id, title, description):

| Method | Path pattern | Description |
|--------|-------------|-------------|
| `POST` | `/{architecture}/tasks` | Create a task |
| `GET`  | `/{architecture}/tasks` | Get all tasks |

All architectures share a single PostgreSQL `tasks` table.

## Architectures

| Folder | Endpoint prefix | Key idea |
|--------|----------------|----------|
| `layered_entity_only` | `/layered-entity-only` | No domain model, no DTOs — entity flows through all layers |
| `layered_entity_as_domain` | `/layered-no-domain` | JPA entity doubles as domain model |
| `layered` | `/layered` | Classic 4-layer: presentation → application → domain ← infrastructure |
| `onion` | `/onion` | Concentric rings; domain is framework-free, wired via config |
| `hexagonal` | `/hexagonal` | Ports & adapters; core defines `TaskPort` / `TaskRepoPort` interfaces |
| `clean` | `/clean` | Input boundary / interactor / gateway — Uncle Bob's naming |
| `cqrs` | `/cqrs` | Separate `CreateTaskCommandHandler` and `GetAllTasksQueryHandler` |

## Running

Requires Docker.

```bash
./gradlew bootRun
```

Spring Boot auto-starts the PostgreSQL container via Docker Compose on startup.

## Tech Stack

- Kotlin + Spring Boot 4
- Spring Data JPA / Hibernate
- PostgreSQL
- Docker Compose (via `spring-boot-docker-compose`)
