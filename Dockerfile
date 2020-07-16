FROM devopsedu/webapp
ADD Seltest.jar /var/www/html
RUN rm /var/www/html/index.html
CMD apachectl -D FOREGROUND
