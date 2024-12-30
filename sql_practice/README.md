# SQLite Database Setup

This guide explains how to create and populate the SQLite `.db` file by executing an `.sql` file containing your database schema and data.

---

## Prerequisites

### 1. SQLite CLI
Ensure that SQLite is installed on your system. To check:

```bash
sqlite3 --version
```

If SQLite is not installed, download it from the SQLite downloads page -> `https://www.sqlite.org/download.html`

### 2. SQL Script
A `.sql` file is provided for each directory. You will need to fill out the schema as it is not provided.

Example:
```sql
-- Create the students table
CREATE TABLE students (
    id INTEGER PRIMARY KEY,
    name TEXT NOT NULL,
    age INTEGER
);

-- Insert sample data into students
INSERT INTO students (name, age) VALUES ('Alice', 22), ('Bob', 24);
```

### 3. Populate the SQLite database file.

```bash
sqlite3 DDL.db < schema.sql
```

* `DDL.db`: The SQLite database file to create or update.
* `schema.sql`: The file containing your SQL commands.

### 4. Verify the Database

After verifying the script, you can open the `.db` file in SQLite CLI to verify its contents.

```bash
sqlite3 DDL.db
```

* List all tables:
```bash
.tables
```

* View data from table:
```bash
SELECT * FROM students;
```

### Recommended Tools

If you prefer a GUI for managing your SQLite database, use the following tools:
* DB Browser for SQLite -> `https://sqlitebrowser.org/`
* SQLiteStudio -> `https://sqlitestudio.pl/`