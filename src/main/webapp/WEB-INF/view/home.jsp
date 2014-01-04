<!DOCTYPE HTML>
<html>
  <head>
    <title>Sample Application</title>
  </head>
  <body>
	<h1>Hello, ${name}!</h1>
	<hr><hr>
	<form action="hello.jsp" method="POST" >
      <table width="75%">
        <tr> 
          <td width="48%">User name</td>
          <td width="52%">
            <input type="text" name="name" />
          </td>
        </tr>
        <tr> 
          <td width="48%">Password</td>
          <td width="52%">
            <input type="text" name="name" />
          </td>
        </tr>
      </table>
      <p> 
        <input type="submit" name="Submit" value="Submit" />
        <input type="reset" name="Reset" value="Reset form" />
      </p>
    </form>
	
  </body>
</html>