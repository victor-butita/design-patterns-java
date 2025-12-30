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
| Observer | Behavioral | ✅|


=== Email Observer Pattern Demo ===
Added: Inbox Counter
Added: Popup Notifier

Observers registered: 2

📧 New email from: boss@company.com
📬 Inbox: 1 unread emails
🔔 POPUP: New email from boss@company.com
Message: Meeting at 3 PM today...

📧 New email from: friend@gmail.com
📬 Inbox: 2 unread emails
🔔 POPUP: New email from friend@gmail.com
Message: Want to grab lunch?...

=== Results ===
Total unread: 2
Demo complete!

🏢 Welcome to our office! Let's use the printer...

Printer Manager Created - I'm in-charge of the printer
📋 Printer Status: READY
Printing : Monthly ReportforAlice

📋 Printer Status: BUSY - Monthly Report(Alice)
Sorry Bob,printer is busy with: Monthly Report(Alice)

✅ Alice and Bob are using the SAME PrinterManager!
This is the Singleton pattern working!
aliceManager memory address: 1392838282
bobManager memory address: 1392838282

🎯 Lab Complete! You've implemented the Singleton pattern!

☕ Welcome to Coffee Factory Demo!

📝 Customer orders: espresso
🏭 Creating Espresso
Brewing Strong Espresso
💰 Price: $2.5

📝 Customer orders: latte
🏭 Creating Latte
Brewing Creamy Latte
💰 Price: $4.5

📝 Customer orders: mocha
❌ Unknown coffee type: mocha

✅ Factory Pattern Demo Complete!
