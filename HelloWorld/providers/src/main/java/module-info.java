module com.paulojeronimo.providers {
  requires com.paulojeronimo.utils;
  requires com.paulojeronimo.services;
  provides com.paulojeronimo.services.MessageService
    with com.paulojeronimo.services.impl.TextMessageService;
}
