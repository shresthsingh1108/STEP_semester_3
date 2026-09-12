# STEP_semester_3

Semester 3 projects, assignments, and programming practice work.

---

## Repository Architecture & Git Workflow

This repository strictly adheres to the official course workflow:

- **`main`**: Documentation only. Contains the project overview, workflow guidelines, and the daily session progress log. Never contains Java source or `.class` files.
- **`develop`**: Clean, base Java project skeleton and configuration (`.gitignore`). Serves as the base branch from which all feature branches originate. Never holds solved code and is never merged back into from feature branches.
- **`feature/session_N`**: Dedicated feature branches created from `develop` for each session's solutions (`develop -> feature/session_N`).

### Package & Directory Structure Convention

Within feature branches, Java code is structured following standard conventions:
```text
src/
â””â”€â”€ main/
    â””â”€â”€ java/
        â””â”€â”€ <topic>/
            â”œâ”€â”€ class_problems/
            â””â”€â”€ assigment_problems/
```
*(Note: `assigment_problems` intentionally follows the course naming convention with a single 'n'.)*

---

## Daily Progress Log

### Session 1 / Week 1 â€” Strings & Arrays

- **Branch**: [`feature/session_1`](https://github.com/shresthsingh1108/STEP_semester_3/tree/feature/session_1)
- **Topic**: `string`
- **Status**: All 10/10 problems implemented, compiled, and verified.

#### 1. Live-Coding Session (Class Problems)
Location: `src/main/java/string/class_problems/`

| # | Problem Name | Source File | Key Concepts | Status |
|---|---|---|---|---|
| 1 | Rock-Paper-Scissors Game | [`RockPaperScissors.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/class_problems/RockPaperScissors.java) | Random number generation, loops, round history table, statistics | Verified |
| 2 | Palindrome Checker (3 Approaches) | [`PalindromeChecker.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/class_problems/PalindromeChecker.java) | Iterative pointers, recursion, array reversal | Verified |
| 3 | BMI Calculator for a Team | [`BmiCalculator.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/class_problems/BmiCalculator.java) | Parallel arrays, BMI formula, health status classification, formatted table | Verified |
| 4 | First Non-Repeating Character | [`FirstNonRepeatingChar.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/class_problems/FirstNonRepeatingChar.java) | Frequency array, early-exit linear scan | Verified |
| 5 | Reverse Customer Name | [`ReverseCustomerName.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/class_problems/ReverseCustomerName.java) | Character array traversal, string reconstruction | Verified |

#### 2. Week 1 Assignment Problems
Location: `src/main/java/string/assigment_problems/`

| # | Problem Name | Source File | Key Concepts | Status |
|---|---|---|---|---|
| 1 | The Exam Hall Seat Duplication Checker | [`SeatDuplicationChecker.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/assigment_problems/SeatDuplicationChecker.java) | Nested loops, array search, no Collections | Verified |
| 2 | The Typing Speed Test Accuracy Checker | [`TypingAccuracyChecker.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/assigment_problems/TypingAccuracyChecker.java) | Positional character comparison, accuracy percentage, first mismatch tracking | Verified |
| 3 | The Traffic Signal Streak Analyzer | [`TrafficSignalStreakAnalyzer.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/assigment_problems/TrafficSignalStreakAnalyzer.java) | Streak counting, running maximum tracking | Verified |
| 4 | The Warehouse Inventory Balancer | [`WarehouseInventoryBalancer.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/assigment_problems/WarehouseInventoryBalancer.java) | Array summation, section balance comparison, maximum tracking with index | Verified |
| 5 | The Movie Review Word Length Profiler | [`MovieReviewWordLengthProfiler.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_1/src/main/java/string/assigment_problems/MovieReviewWordLengthProfiler.java) | String splitting (`split()`), word length categorization | Verified |

---

### Session 2 / Week 2 â€” String Processing & Validation

- **Branch**: [`feature/session_2`](https://github.com/shresthsingh1108/STEP_semester_3/tree/feature/session_2)
- **Topic**: `string`
- **Status**: All 10/10 problems implemented, compiled, and verified.

#### 1. Live-Coding Session (Class Problems)
Location: `src/main/java/string/class_problems/`

| # | Problem Name | Source File | Key Concepts | Status |
|---|---|---|---|---|
| 1 | Vowel & Consonant Counter | [`Vowelsconsonants.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/class_problems/Vowelsconsonants.java) | `charAt()`, `length()`, case-insensitive character comparison | Verified |
| 2 | CSV Student Record Parser | [`Studentrecord.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/class_problems/Studentrecord.java) | `split(",")`, array length validation, string formatting | Verified |
| 3 | File Extension Validator | [`FileExtensionValidator.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/class_problems/FileExtensionValidator.java) | `lastIndexOf('.')`, `substring()`, `equalsIgnoreCase()` | Verified |
| 4 | Masked Phone Number Formatter | [`PhoneNo.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/class_problems/PhoneNo.java) | Digit validation, `StringBuilder`, masking pattern | Verified |
| 5 | Bank Transaction Reference Generator & Validator | [`Bank.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/class_problems/Bank.java) | `trim()`, substring extraction, multi-stage manual validation | Verified |

#### 2. Week 2 Assignment Problems
Location: `src/main/java/string/assigment_problems/`

| # | Problem Name | Source File | Key Concepts | Status |
|---|---|---|---|---|
| 1 | ATM PIN Length Validator | [`AtmPinValidator.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/assigment_problems/AtmPinValidator.java) | `length()`, single `if / else`, comparison operators | Verified |
| 2 | Word Reversal Encoder | [`WordReversalEncoder.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/assigment_problems/WordReversalEncoder.java) | `split(" ")`, `StringBuilder.reverse()`, word traversal | Verified |
| 3 | Product Inventory CSV Parser | [`ProductInventoryParser.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/assigment_problems/ProductInventoryParser.java) | `split(",")`, field count validation, formatted record | Verified |
| 4 | Library ISBN Normalizer & Validator | [`IsbnValidator.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/assigment_problems/IsbnValidator.java) | `trim()`, `Character.isLetter()`, `isDigit()`, `StringBuilder` | Verified |
| 5 | Stop-Word-Filtered Word Frequency Report | [`StopWordFrequencyReport.java`](https://github.com/shresthsingh1108/STEP_semester_3/blob/feature/session_2/src/main/java/string/assigment_problems/StopWordFrequencyReport.java) | Punctuation stripping, stop-word filtering, `HashMap`, descending sort | Verified |