/**
 * 
getById 
 */
	
	 var a= $(location).attr('href');	
 $(document).ready(function(){
	
	
	var a =window.location.search;
			a=a.slice(4);
	
	
	$.ajax({
  				url:'items//findOne/'+a,
  				method:'get',
  				dataType:'json',
  				success: function(data){
					
					var formData = {
					
					islem : $("#islem").val(data.islem),
					miktar : $("#miktar").val(data.miktar),
					aciklama : $("#aciklama").val(data.aciklama),
					
					
					
				}
}
});

	});		