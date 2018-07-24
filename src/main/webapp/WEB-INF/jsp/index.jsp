<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
   <link rel="icon" href="http://imcsgroup.net/img/logos/home/imcs-group-grey-logo.png">

    <title>Sign in IMCS</title>

    <!-- Bootstrap core CSS -->
    <link href="https://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="resources/css/sign-in.css" rel="stylesheet">
  </head>

  <body class="text-center">
    <form class="form-signin" action="${contextPath}/home">
      <img class="mb-4" src="http://imcsgroup.net/img/logos/home/imcs-group-grey-logo.png" alt="" width="178" height="82">
      <h1 class="h3 mb-3 font-weight-normal">Log in to your account</h1>
      <label for="inputEmail" class="sr-only">Email address</label>
      <input type="email" id="inputEmail" class="form-control" placeholder="Email address" required autofocus>
      <label for="inputPassword" class="sr-only">Password</label>
      <input type="password" id="inputPassword" class="form-control" placeholder="Password" required>
      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
      </div>
      <button class="btn btn-lg btn-primary btn-block" type="submit">Log in</button>
    </form>
  </body>
</html>