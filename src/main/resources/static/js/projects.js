$(document).ready(function()
{
    $('.meiset-li').on( "click",function(e)
    {

        $(".meiset-li").addClass("active");
        $(".meishet-div").removeClass("display-none");

        $(".hediyye-li").removeClass("active");
        $(".portret-li").removeClass("active");
        $(".bayram-li").removeClass("active");
        $(".ozelgun-li").removeClass("active");
        $(".qablasdirma-li").removeClass("active");

        $(".hediyye-div").addClass("display-none");
        $(".portret-div").addClass("display-none");
        $(".bayram-div").addClass("display-none");
        $(".ozelgun-div").addClass("display-none");
        $(".qablasdirma-div").addClass("display-none");
    });

    $('.hediyye-li').on( "click",function(e)
    {
        $(".hediyye-li").addClass("active");
        $(".hediyye-div").removeClass("display-none");

        $(".meiset-li").removeClass("active");
        $(".portret-li").removeClass("active");
        $(".bayram-li").removeClass("active");
        $(".ozelgun-li").removeClass("active");
        $(".qablasdirma-li").removeClass("active");

        $(".meishet-div").addClass("display-none");
        $(".portret-div").addClass("display-none");
        $(".bayram-div").addClass("display-none");
        $(".ozelgun-div").addClass("display-none");
        $(".qablasdirma-div").addClass("display-none");
    });


    $('.portret-li').on( "click",function(e)
    {
        $(".portret-li").addClass("active");
        $(".portret-div").removeClass("display-none");

        $(".meiset-li").removeClass("active");
        $(".hediyye-li").removeClass("active");
        $(".bayram-li").removeClass("active");
        $(".ozelgun-li").removeClass("active");
        $(".qablasdirma-li").removeClass("active");



        $(".meishet-div").addClass("display-none");
        $(".hediyye-div").addClass("display-none");
        $(".bayram-div").addClass("display-none");
        $(".ozelgun-div").addClass("display-none");
        $(".qablasdirma-div").addClass("display-none");
    });

    $('.bayram-li').on( "click",function(e)
    {
        $(".bayram-li").addClass("active");
        $(".bayram-div").removeClass("display-none");

        $(".meiset-li").removeClass("active");
        $(".hediyye-li").removeClass("active");
        $(".portret-li").removeClass("active");
        $(".ozelgun-li").removeClass("active");
        $(".qablasdirma-li").removeClass("active");



        $(".meishet-div").addClass("display-none");
        $(".hediyye-div").addClass("display-none");
        $(".portret-div").addClass("display-none");
        $(".ozelgun-div").addClass("display-none");
        $(".qablasdirma-div").addClass("display-none");
    });

    $('.ozelgun-li').on( "click",function(e)
    {
        $(".ozelgun-li").addClass("active");
        $(".ozelgun-div").removeClass("display-none");

        $(".meiset-li").removeClass("active");
        $(".hediyye-li").removeClass("active");
        $(".portret-li").removeClass("active");
        $(".bayram-li").removeClass("active");
        $(".qablasdirma-li").removeClass("active");



        $(".meishet-div").addClass("display-none");
        $(".hediyye-div").addClass("display-none");
        $(".portret-div").addClass("display-none");
        $(".bayram-div").addClass("display-none");
        $(".qablasdirma-div").addClass("display-none");
    });

    $('.qablasdirma-li').on( "click",function(e)
    {
        $(".qablasdirma-li").addClass("active");
        $(".qablasdirma-div").removeClass("display-none");

        $(".meiset-li").removeClass("active");
        $(".hediyye-li").removeClass("active");
        $(".portret-li").removeClass("active");
        $(".bayram-li").removeClass("active");
        $(".ozelgun-li").removeClass("active");



        $(".meishet-div").addClass("display-none");
        $(".hediyye-div").addClass("display-none");
        $(".portret-div").addClass("display-none");
        $(".bayram-div").addClass("display-none");
        $(".ozelgun-div").addClass("display-none");
    });

});