import {
  Button,
  Image,
  SafeAreaView,
  StatusBar,
  StyleSheet,
  Text,
  TextInput,
  View,
  TouchableOpacity,
} from "react-native";

export default function App() {
  return (
    <View style={styles.container}>
      <View style={styles.navBar}>
        <Text style={styles.navBarTitle}>Example 1</Text>
      </View>
      <View style={styles.content}>
        <Image source={require("./assets/matcirkel.png")} style={styles.img} />
        <View style={styles.buttons}>
          <View style={styles.row}>
            <CustomButton />
            <CustomButton />
          </View>
          <View style={styles.row}>
            <CustomButton />
            <CustomButton />
          </View>
        </View>
        <View style={styles.textField}>
          <View style={styles.dummy}>
            <Text style={styles.textFieldText}>Email:</Text>
          </View>
          <TextInput
            placeholder="Enter text"
            style={styles.textInput}
          ></TextInput>
          <View style={styles.dummy}></View>
        </View>
      </View>
    </View>
  );
}

const CustomButton = () => {
  return (
    <TouchableOpacity
      style={styles.button}
      onPress={() => console.log("press")}
      underlayColor="#fff"
    >
      <Text style={styles.btnText}>BUTTON</Text>
    </TouchableOpacity>
  );
};

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: "#fff",
    alignItems: "center",
    justifyContent: "center",
  },
  navBar: {
    paddingTop: StatusBar.currentHeight,
    paddingBottom: 20,
    width: "100%",
    backgroundColor: "#008080",
  },
  navBarTitle: {
    color: "white",
    fontSize: 16,
    fontWeight: "500",
    paddingLeft: 20,
  },
  content: {
    flex: 1,
    width: "100%",
    alignItems: "center",
  },
  img: {
    width: 150,
    height: 150,
    marginTop: 10,
    marginBottom: 50,
  },
  buttons: {
    display: "flex",
    width: "100%",
    flexDirection: "column",
    justifyContent: "center",
  },
  row: {
    display: "flex",
    width: "100%",
    flexDirection: "row",
    justifyContent: "space-between",
    marginBottom: 50,
    height: 50,
    paddingHorizontal: 70,
  },
  button: {
    backgroundColor: "#d3d3d3",
    padding: 10,
    borderRadius: 5,
    justifyContent: "center",
  },
  btnText: {
    fontWeight: "500",
  },
  textField: {
    display: "flex",
    width: "100%",
    flexDirection: "row",
  },
  textFieldText: {
    fontWeight: "300",
    paddingLeft: 20,
  },
  textInput: {
    flex: 2,
    borderBottomWidth: 1,
    borderColor: "black",
  },
  dummy: {
    flex: 1,
  },
});
