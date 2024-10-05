#include <GL/glut.h>

void display(void)
{
  //Clear color and depth buffers
  glClear(GL_COLOR_BUFFER_BIT | GL_DEPTH_BUFFER_BIT);
  glPushMatrix();
  // Assign a color to the teapot
  glColor3f(0.0, 1.0, 0.0);
  // Rotation
  glRotatef(10, 0.0, 0.0, 1.0);
  glRotatef(10, 0.0, 1.0, 0.0);

  //Draw
  glutWireTeapot(1);
  glPopMatrix();
  //Must swap the buffer in double buffer mode
  glutSwapBuffers();
}

void init(void)
{
  glClearColor(0.0, 0.0, 0.0, 0.0);
  //Model(Object coordinates), View (Camera coordinates), Projection (Screen coordinates)
  glMatrixMode(GL_PROJECTION);
  gluPerspective(40.0, 1.0, 1.0, 10.0);
  glMatrixMode(GL_MODELVIEW);
  gluLookAt(0.0, 0.0, 5.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.);
}

int main(int argc, char **argv)
{
  glutInit(&argc, argv);
  glutInitDisplayMode(GLUT_DOUBLE | GLUT_RGB | GLUT_DEPTH);
  glutInitWindowSize(500, 500);
  glutCreateWindow("Hello Panama!");
  init();
  glutDisplayFunc(display);
  glutMainLoop();
  return 0;
}
