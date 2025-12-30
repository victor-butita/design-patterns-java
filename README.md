# 🧠 Design Patterns in Action (Java)

A **hands-on, executable collection of design patterns** implemented in Java, focused on:
- Real-world analogies
- Clean structure
- Observable runtime behavior
- Easy extension as more patterns are added

> This README evolves as new patterns (Builder, Strategy, Observer, etc.) are introduced.

---

## 📦 Patterns Implemented

| Pattern | Type | Status |
|------|------|------|
| Singleton | Creational | ✅ |
| Factory | Creational | ✅ |
| Builder | Creational | ⏳ |
| Strategy | Behavioral | ⏳ |
| Observer | Behavioral | ⏳ |

---

# 🔒 Singleton Design Pattern

### 📌 Intent
Ensure **only one instance** of a class exists and provide a **global access point** to it.

---

### 💡 Example Use Case
A **Printer Manager** in an office:
- Only **one printer controller** should exist
- Multiple users share the same printer
- Prevents conflicting print jobs

---

### 🧠 Key Characteristics
- 🔐 Private constructor
- 🧩 Single shared instance
- 📍 Controlled access via `getManager()`

---

### 🏗️ Implementation Overview
- `PrinterManager` manages printer state
- Instance is created once
- All users receive the **same object reference**

---

### ▶️ Sample Output

```text
🏢 Welcome to our office! Let's use the printer...

Printer Manager Created - I'm in-charge of the printer
📋 Printer Status: READY
Printing : Monthly Report for Alice

📋 Printer Status: BUSY - Monthly Report(Alice)
Sorry Bob, printer is busy with: Monthly Report(Alice)

✅ Alice and Bob are using the SAME PrinterManager!
   aliceManager memory address: 681842940
   bobManager memory address: 681842940
