/*!
 * easion - Bootstrap dashboard template based on Bootstrap 4
 * Version v1.0.0
 * Copyright 2016 - 2020 Mudimedia Software
 * https://mudimedia.com
 */
function changeSortBy(){
    let sortBy = document.getElementById("sortBy").value;
    //Gọi controller
    window.location="findAll?sortBy="+sortBy;
}
function changeDirection(){
    let direction = document.getElementById("direction").value;
    window.location="findAll?direction="+direction;
}
// const mobileBreakpoint = window.matchMedia("(max-width: 991px )");
//
// $(document).ready(function(){
//     $(".dash-nav-dropdown-toggle").click(function(){
//         $(this).closest(".dash-nav-dropdown")
//             .toggleClass("show")
//             .find(".dash-nav-dropdown")
//             .removeClass("show");
//
//         $(this).parent()
//             .siblings()
//             .removeClass("show");
//     });
//
//     $(".menu-toggle").click(function(){
//         if (mobileBreakpoint.matches) {
//             $(".dash-nav").toggleClass("mobile-show");
//         } else {
//             $(".dash").toggleClass("dash-compact");
//         }
//     });
//
//     $(".searchbox-toggle").click(function(){
//         $(".searchbox").toggleClass("show");
//     });
//
//     // Dev utilities
//     // $("header.dash-toolbar .menu-toggle").click();
//     // $(".searchbox-toggle").click();
// });
