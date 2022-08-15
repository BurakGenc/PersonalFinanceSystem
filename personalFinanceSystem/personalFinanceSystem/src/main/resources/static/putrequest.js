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
			var a =window.location.search;
			a=a.slice(4);
			function ajaxPost() {

				// PREPARE FORM DATA
				var formData = {
					id :a,
					islem : $("#islem").val(),
					miktar : $("#miktar").val(),
					aciklama : $("#aciklama").val()
				}

				// DO POST
				$.ajax({
					type : "PUT",
					contentType : "application/json",
					url :  "/items/update",
					data : JSON.stringify(formData),
					dataType : 'json',
					success : function(result) {
						
					window.location.href="http://localhost:8080/kayitlar.html";
					
						console.log(result);
					},
					error : function(e) {
						alert(a)
						 console.log(JSON.stringify(error));
					}
				});

			}

		})