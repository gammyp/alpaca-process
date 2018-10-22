<template>
  <div class="hello">
    <h1>{{ msg }},
      <span>{{firstSubject.subjectName}}</span>
    </h1>
  </div>
</template>

<script>
import axios from 'axios'
export default {
  name: 'HelloWorld',
  props: {
    msg: String
  },
  data () {
    return {
      firstSubject: ''
    }
  },
  mounted () {
    this.fetchFirstSubject()
  },
  methods: {
    fetchFirstSubject: async function () {
      let firstSubject = await axios.get('http://localhost:8081/subject/1')

      this.firstSubject = firstSubject.data
      console.log(this.firstSubject)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
span {
  animation-name: changeColor;
  animation-duration: 2s;
  animation-iteration-count: infinite;
}
@keyframes changeColor {
  0% {
    color: #778633;
  }
  25% {
    color: #dc364c;
  }
  50% {
    color: #d4587a;
  }
  100% {
    color: #cc8a56;
  }
}

span:hover {
  font-size: 50px;
  transition: 0.75s;
}

span:not(:hover) {
  transition: 0.75s;
}
</style>
