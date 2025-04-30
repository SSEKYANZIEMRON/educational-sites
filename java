<script>
  // Save and load from localStorage
  function saveUser(username, password) {
    localStorage.setItem('user', JSON.stringify({ username, password }));
  }

  function getUser() {
    return JSON.parse(localStorage.getItem('user')) || { username: '', password: '' };
  }

  function setLoggedIn(username) {
    localStorage.setItem('loggedInUser', username);
    showWelcome(username);
  }

  function getLoggedInUser() {
    return localStorage.getItem('loggedInUser');
  }

  function logout() {
    localStorage.removeItem('loggedInUser');
    location.reload(); // Refresh the page
  }

  function showWelcome(username) {
    document.getElementById('auth-message').textContent = '';
    document.getElementById('welcome-message').style.display = 'block';
    document.getElementById('welcome-message').textContent = `🎉 Welcome, ${username}! You are now logged in.`;
    document.getElementById('login-section').style.display = 'none';
    document.getElementById('register-section').style.display = 'none';
    document.getElementById('logout-btn').style.display = 'inline-block';
  }

  function register() {
    const username = document.getElementById('reg-username').value.trim();
    const password = document.getElementById('reg-password').value.trim();
    const message = document.getElementById('auth-message');

    if (username === '' || password === '') {
      message.textContent = '⚠️ Please fill in both fields.';
      message.style.color = 'orange';
      return;
    }

    saveUser(username, password);

    message.textContent = '✅ Registered successfully! You can now log in.';
    message.style.color = 'green';

    document.getElementById('reg-username').value = '';
    document.getElementById('reg-password').value = '';
  }

  function login() {
    const username = document.getElementById('login-username').value.trim();
    const password = document.getElementById('login-password').value.trim();
    const message = document.getElementById('auth-message');
    const user = getUser();

    if (username === '' || password === '') {
      message.textContent = '⚠️ Please enter both username and password.';
      message.style.color = 'orange';
      return;
    }

    if (username === user.username && password === user.password) {
      setLoggedIn(username);
    } else {
      message.textContent = '❌ Invalid login. Try again.';
      message.style.color = 'red';
    }
  }

  // On page load, check if someone is logged in
  window.onload = function () {
    const username = getLoggedInUser();
    if (username) {
      showWelcome
<script>
  window.onload = function() {
    // Select all sections with the 'fade-in' class
    const fadeElements = document.querySelectorAll('.fade-in');

    // Add a class to trigger the fade-in animation
    fadeElements.forEach(element => {
      element.classList.add('fade-in');
    });
  };
</script>
