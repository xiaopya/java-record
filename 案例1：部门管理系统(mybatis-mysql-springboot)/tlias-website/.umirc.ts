import { defineConfig } from "umi";
export default defineConfig({
  routes: [
    { path: "/", redirect: "Home" },
    { path: "/home", component: "Home",title: 'xiaopy',},
    { path: "/emp", component: "Emp",title: '用户管理', },
    { path: "/dept", component: "Dept",title: '部门管理',},
  ],
  npmClient: "npm",
});
