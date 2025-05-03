# Stage 1
FROM node:lts-alpine3.21 as build
WORKDIR /app
COPY package*.json ./
RUN ["npm", "i"]
COPY . .
RUN ["npm", "run", "build"]

# Stage 2
FROM nginx:stable-alpine3.21
COPY --from=build /app/dist /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]