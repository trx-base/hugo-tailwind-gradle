FROM nginx:alpine
COPY ./build/hugo/publish /usr/share/nginx/html
