document.getElementById('registrationForm').addEventListener('submit', function(event) {
    event.preventDefault();
  
    var username = document.getElementById('username').value;
    var email = document.getElementById('email').value;
    var password = document.getElementById('password').value;
  
    // Reset error messages
    document.getElementById('usernameError').textContent = '';
    document.getElementById('emailError').textContent = '';
    document.getElementById('passwordError').textContent = '';
  
    // Validate username
    if (!username) {
      document.getElementById('usernameError').textContent = 'Username is required';
      return;
    }
  
 
    if (!email) {
      document.getElementById('emailError').textContent = 'Email is required';
      return;
    } else if (!isValidEmail(email)) {
      document.getElementById('emailError').textContent = 'Invalid email format';
      return;
    }
  
    if (!password) {
      document.getElementById('passwordError').textContent = 'Password is required';
      return;
    }
  
    alert('Registration successful!');
    document.getElementById('registrationForm').reset();
  });
  
  function isValidEmail(email) {
    var emailRegex = /\S+@\S+\.\S+/;
    return emailRegex.test(email);
  }
  