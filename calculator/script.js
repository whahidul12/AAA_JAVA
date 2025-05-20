
const input = document.querySelector(".input");
const inputValue = (value) => {

  input.textContent += value
  console.log(input.textContent);
}
const submit = (value) => {

  input.textContent = eval(input)
  console.log(input.textContent);
}