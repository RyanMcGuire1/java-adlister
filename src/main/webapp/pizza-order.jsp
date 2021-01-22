<%--
  Created by IntelliJ IDEA.
  User: ryanmcguire
  Date: 1/21/21
  Time: 3:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Shop</title>
</head>
<body>
    <h1>How would you like your Pizza?</h1>
    <form action = "/pizza" method = "post">
        <label for = "crust">Crust Type</label>
            <select name = "crust" id = "crust">
                <option value="hand-tossed">Hand Tossed</option>
                <option value="thin">Thin Crust</option>
                <option value="stuffed-crust">Stuff Crust</option>
            </select>

        <br>
        <label for = "sauce">Sauce Type</label>
            <select name = "sauce" id = "sauce">
                <option value = "marinara">Marinara</option>
                <option value = "alfredo">Alfredo</option>
                <option value = "bbq">BBQ</option>
            </select>

        <br>
        <label for = "size">Sauce Type</label>
            <select name = "size" id = "size">
                <option value = "small">Small</option>
                <option value = "medium">Medium</option>
                <option value = "Large">Large</option>
            </select>

        <br>

        <label for = "pepperoni">Pepperoni</label>
            <input type="checkbox" name="topping" value="pepperoni" id ="pepperoni">

        <label for = "cheese">Cheese</label>
            <input type="checkbox" name="topping" value="cheese" id = "cheese" >

        <label for = "red-pepper">Red Pepper</label>
            <input type="checkbox" name="topping" value="red-pepper" id = "red-pepper">

        <label for = "green-pepper">Green pepper</label>
            <input type="checkbox" name="topping" value="green-pepper" id = "green-pepper">

        <label for = "jalapeno"></label>Jalapeno
            <input type="checkbox" name="topping" value="jalapeno" id = "jalapeno">

        <label for= "address">Address:</label>
        <input type = "text" name ="address" id = "address">

        <button type = "submit">Order pizza!</button>

    </form>

</body>
</html>
