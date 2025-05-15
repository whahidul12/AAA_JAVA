
// const one = () => {
//   let canvas = "";
//   num = document.querySelector("#button").value;
//   canvas += num;
//   document.querySelector(".input").innerHTML = canvas
//   console.log("one ", num, document.querySelector("#button"));
// }
const input = document.querySelector(".input");
const inputValue = (value) => {

  input.textContent += value
  console.log(input.textContent);
}