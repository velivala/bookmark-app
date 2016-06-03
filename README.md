# bookmark-app
Deploy the app
```json
{
  "id": "/bookmark",
  "cmd": null,
  "cpus": 1,
  "mem": 512,
  "disk": 0,
  "instances": 1,
  "container": {
    "type": "DOCKER",
    "volumes": [],
    "docker": {
      "image": "kranthi009/bookmark-app:latest",
      "network": "BRIDGE",
      "portMappings": [
        {
          "containerPort": 8080,
          "hostPort": 0,
          "servicePort": 10112,
          "protocol": "tcp",
          "labels": {}
        }
      ],
      "privileged": false,
      "parameters": [],
      "forcePullImage": false
    }
  },
  "labels": {
    "HAPROXY_GROUP": "external",
    "HAPROXY_0_VHOST": "bookmark-app.dci.us",
    "HAPROXY_0_PORT": "8080"
  },
  "portDefinitions": [
    {
      "port": 10112,
      "protocol": "tcp",
      "labels": {}
    }
  ]
}