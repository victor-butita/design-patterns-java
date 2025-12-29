# 🔒 Singleton Design Pattern (Java)

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
- `getManager()` creates the instance once
- All users receive the **same object**

---

### ▶️ Sample Output

```text
🏢 Welcome to our office! Let's use the printer...

Printer Manager Created - I'm in-charge of the printer
📋 Printer Status: READY
Printing : Monthly ReportforAlice

📋 Printer Status: BUSY - Monthly Report(Alice)
Sorry Bob,printer is busy with: Monthly Report(Alice)

✅ Alice and Bob are using the SAME PrinterManager!
   This is the Singleton pattern working!
   aliceManager memory address: 681842940
   bobManager memory address: 681842940

🎯 Lab Complete! You've implemented the Singleton pattern!
