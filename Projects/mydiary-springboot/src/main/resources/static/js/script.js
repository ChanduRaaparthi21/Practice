document.addEventListener("DOMContentLoaded", function() {
    const signoutLink = document.querySelector('a[href="./signout"]');
    const addEntryButton = document.querySelector('.addbtn');

    if (signoutLink) {
        signoutLink.addEventListener('click', function(event) {
            event.preventDefault();
            if (confirm("Are you sure you want to sign out?")) {
                window.location.href = this.href;
            }
        });
    }

    if (addEntryButton) {
        addEntryButton.addEventListener('click', function(event) {
            alert("Ready to add a new entry?");
        });
    }

    const viewLinks = document.querySelectorAll('a[href^="./viewentry"]');
    viewLinks.forEach(function(link) {
        link.addEventListener('click', function(event) {
            event.preventDefault();
            alert("Viewing entry...");
            window.location.href = this.href;
        });
    });
});
