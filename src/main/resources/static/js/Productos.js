// JavaScript Document


var lista=[
	"www.facebook.com",
	"www.youtube.com"
];
function direccionar(n){
	document.getElementsByClassName("rs").href=lista(n);
}

   
$(document).ready(function(){
	 $(window).scroll(function(){     
        //scroll-up
        if(this.scrollY > 450 && this.scrollY < 2400){
            $('.scroll-up-btn').addClass("show");
        }else{
            $('.scroll-up-btn').removeClass("show");
        }
        
    });
    
    
	var lista=[
	"www.facebook.com",
	"www.youtube.com"
];
function direccionar(n){
	document.getElementsByClassName("rs").href=lista(n);
}	
	
	$("#baner").cycle({
		'fx':'scrollLeft',
		'timeout':1000,
		'delay':500
	});
	
	$(".reseña").hover(
	function(){
	$(this).find("img").fadeOut(500);
	$(this).find("p").fadeIn(500);	
	},
		
	function(){
	$(this).find("img").fadeIn(500);
	$(this).find("p").fadeOut(500);
	}	
	);

   
	
	 //slider del dedo
    $('.scroll-up-btn').click(function(){
        $('html').animate({scrollTop: 0});
    });
    
	//animar letra
    var typed = new Typed(".letra", {
        strings: ["mejor precio"],
        typeSpeed: 100,
        backSpeed: 60,
        loop: true
    });

});