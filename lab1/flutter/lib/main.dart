import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.teal),
        useMaterial3: true,
      ),
      home: const MyHomePage(title: 'Example 1'),
    );
  }
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key, required this.title});
  // This widget is the home page of your application.
  final String title;

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  @override
  Widget build(BuildContext context) {
    // This method is rerun every time setState is called, for instance as done
    return Scaffold(
      appBar: AppBar(
          backgroundColor: Colors.teal,
          title: Align(
              child: Text(
                widget.title,
                style: const TextStyle(
                  color: Colors.white,
                ),
                textAlign: TextAlign.left,
              ),
              alignment: Alignment.centerLeft)),
      body: Center(
        // Center is a layout widget. It takes a single child and positions it
        // in the middle of the parent.
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Image.asset(
              'assets/matcirkel.png',
              width: 150.0,
              height: 150.0,
            ),
            SizedBox(height: 80.0),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: <Widget>[
                MyButton(text: 'Button 1'),
                MyButton(text: 'Button 2'),
              ],
            ),
            SizedBox(height: 20.0),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceAround,
              children: <Widget>[
                MyButton(text: 'Button 3'),
                MyButton(text: 'Button 4'),
              ],
            ),
            const SizedBox(height: 20.0),
            Row(
              mainAxisAlignment: MainAxisAlignment.spaceBetween,
              children: <Widget>[
                const SizedBox(
                    child: Row(
                      mainAxisAlignment: MainAxisAlignment
                          .center, // Adjust the padding as needed
                      children: <Widget>[Text('Email')],
                    ),
                    width: 100.0),
                Expanded(
                  child: TextField(
                    decoration: InputDecoration(
                      labelText: '',
                      border: UnderlineInputBorder(
                        borderSide: BorderSide(
                          color: Colors
                              .black, // Set the color of the bottom border
                        ),
                      ),
                    ),
                  ),
                ),
                const SizedBox(width: 100.0),
              ],
            ),
          ],
        ),
      ),
    );
  }
}

class MyButton extends StatelessWidget {
  final String text;

  MyButton({required this.text});

  @override
  Widget build(BuildContext context) {
    Color lighterGrey = Colors.grey.withOpacity(0.4);
    return ElevatedButton(
      onPressed: () {},
      child: Text("BUTTON"),
      style: ButtonStyle(
        foregroundColor: MaterialStateProperty.all(Colors.black),
        backgroundColor: MaterialStateProperty.all(lighterGrey),
        elevation: MaterialStateProperty.all(0),
        shape: MaterialStateProperty.all<RoundedRectangleBorder>(
          RoundedRectangleBorder(
            borderRadius: BorderRadius.circular(5.0),
          ),
        ),
      ),
    );
  }
}
