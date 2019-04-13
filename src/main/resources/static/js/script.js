new fullpage("#fullpage", {
    sectionsColor: ['', 'white', '#042F5B'],
});

$('body').on('keyup', '.num-search', function(e) {
    if(e.keyCode == 13) {
        e.preventDefault();
        doSearch();
    }
})

$(window).resize(function() {
    var width_size = window.outerWidth;
    var height_size = window.outerHeight;
})