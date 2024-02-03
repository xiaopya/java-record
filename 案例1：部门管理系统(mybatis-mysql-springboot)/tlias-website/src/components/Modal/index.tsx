import React, { useState } from 'react';
import { Modal } from 'antd';

const App: React.FC = (props) => {

  return (
      <Modal title="Basic Modal"  {...props}>
        {props?.content ?? ""}
      </Modal>
  );
};

export default App;