/**
 * 
 */
$(document).ready(
		function() {

			// SUBMIT FORM
			$("#itemForm").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxPost();
			});

			function ajaxPost() {

				// PREPARE FORM DATA
				var formData = {
					islem : $("#islem").val(),
					miktar : $("#miktar").val(),
					aciklama : $("#aciklama").val()
				}

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url :  "/items/save",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						window.location.href="http://localhost:8080/kayitlar.html";
					},
					error : function(e) {
						alert("Error!")
						 console.log(JSON.stringify(error));
					}
				});

			}

		})