$('#itemAddModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget); // Button that triggered the modal
  var recipient = button.data('whatever'); // Extract info from data-* attributes
  var modal = $(this);
  modal.find('.modal-title').text('상품추가');
  modal.find('.modal-body input').val(recipient);
});

$('#adminAddModal').on('show.bs.modal', function (event) {
  var button = $(event.relatedTarget); // Button that triggered the modal
  var recipient = button.data('whatever'); // Extract info from data-* attributes
  var modal = $(this);
  modal.find('.modal-title').text('관리자추가');
  modal.find('.modal-body input').val(recipient);
});