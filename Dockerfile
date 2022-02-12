# 1. For build React app
FROM node:14 AS builder
LABEL stage=builder
# Set working directory
WORKDIR /app

# 
COPY package.json /app/package.json
COPY package-lock.json /app/package-lock.json

RUN npm install

RUN npm ci

COPY . /app

RUN npm install

ENV CI=true
ENV PORT=3000

CMD [ "npm", "start" ]

# Compilate an serve Commands
#FROM development AS build

#RUN npm run build

# 2. For Nginx setup
#FROM nginx:alpine

# Copy config nginx
#COPY --from=build /app/.nginx/nginx.conf /etc/nginx/conf.d/default.conf

#WORKDIR /usr/share/nginx/html

# Remove default nginx static assets
#RUN rm -rf ./*

# Copy static assets from builder stage
#COPY --from=build /app/build .

# Containers run nginx with global directives and daemon off
#ENTRYPOINT ["nginx", "-g", "daemon off;"]

